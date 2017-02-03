package ru.gothmog.isogd.core.utils;

import org.apache.log4j.Logger;

import java.io.File;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassUtils {

    public static final Comparator<Class> HIERARHIC_CLASS_COMPARATOR = new ClassComparator();
    private static Logger logger = Logger.getLogger(ClassUtils.class);

    public ClassUtils() {
    }

    public static Object invokeMethod(Method method, Object target, Object... args) throws InvocationException {
        try {
            return method.invoke(target, args);
        } catch (Exception ex) {
            throw new InvocationException(ex);
        }
    }

    public static Method getMethod(Class owner, String name, Class... args) {
        try {
            return owner.getMethod(name, args);
        } catch (NoSuchMethodException ex) {
            return null;
        }
    }

    public static String upperPropName(String property) {
        return property.length() > 0 ? Character
                .toUpperCase(property.charAt(0)) + property.substring(1)
                : property.toUpperCase();
    }

    public static String lowerPropName(String property) {
        return property.length() > 0 ? Character
                .toLowerCase(property.charAt(0)) + property.substring(1)
                : property.toUpperCase();
    }

    public static String parsePropName(String methodName) {
        Matcher mr = Pattern.compile("(?:get|set)([A-Z])([\\w]+)*").matcher(
                methodName);
        if (mr.matches())
            return mr.group(1).toLowerCase()
                    + (mr.group(2) != null ? mr.group(2) : "");
        else
            return null;
    }

    public static Method getPropertyGetter(Class owner, String property) {
        return getMethod(owner, "get" + upperPropName(property));
    }

    public static Method getPropertySetter(Class owner, String property) {
        return getSetterForGetter(getPropertyGetter(owner, property));
    }

    public static Method getPropertySetter(Class owner, String property,
                                           Class... args) {
        return getMethod(owner, "get" + upperPropName(property), args);
    }

    public static Method getSetterForGetter(Method getter) {
        String propName = parsePropName(getter.getName());
        propName = propName == null ? "" : upperPropName(propName);
        return getMethod(getter.getDeclaringClass(), "set" + propName,
                getter.getReturnType());
    }

    public static Method getGetterForSetter(Method setter) {
        return getMethod(setter.getDeclaringClass(), "get"
                + upperPropName(parsePropName(setter.getName())));
    }

    public static <T> T createInstance(Class<T> clazz) {
        try {
            return clazz.newInstance();
        } catch (Exception e) {
            throw new InvocationException(e);
        }
    }

    public static Class loadClass(String name) {
        if (name == null)
            return null;
        try {
            return Class.forName(name);
        } catch (ClassNotFoundException e) {
            logger.warn("No class with name " + name);
            return null;
        }
    }

    public static Method findAnnotatedMethod(Class ownerClass,
                                             Class<? extends Annotation> annotationClass) {
        for (Method mt : ownerClass.getMethods())
            if (mt.isAnnotationPresent(annotationClass))
                return mt;
        return null;
    }

    public static <T> Constructor<T> getConstructor(Class<T> cls,
                                                    Class... paramClasses) {
        for (Constructor con : cls.getConstructors()) {
            if (con.getParameterTypes().length != paramClasses.length)
                continue;
            if (con.getParameterTypes().length == 0)
                return con;
            for (int i = 0; i < con.getParameterTypes().length; i++) {
                if (paramClasses[i] != null
                        && !con.getParameterTypes()[i]
                        .isAssignableFrom(paramClasses[i]))
                    break;
                if (i == con.getParameterTypes().length - 1)
                    return con;
            }
        }
        return null;
    }

    public static <T> T instantiateClass(Constructor<T> constructor,
                                         Object... params) {
        try {
            return constructor.newInstance(params);
        } catch (Exception e) {
            throw new InvocationException(e);
        }
    }

    public static <T> T createInstance(Class<T> cls, Object... parameters) {
        try {
            Class[] classes = new Class[parameters.length];
            for (int i = 0; i < parameters.length; i++) {
                if (parameters[i] != null)
                    classes[i] = parameters[i].getClass();
                else
                    classes[i] = null;
            }
            return instantiateClass(getConstructor(cls, classes), parameters);
        } catch (Exception e) {
            throw new InvocationException("Cannot create instance of class "
                    + cls.getName() + " with parameters "
                    + parameters.toString());
        }
    }

    public static List<Class> listEntityClass(String packageName) {
        String path = packageName.replace('.', '/');
        URL pathUrl = Thread.currentThread().getContextClassLoader()
                .getResource(path);
        File dir;
        try {
            dir = new File(pathUrl.toURI());
            return getEntityClassList(dir, packageName);
        } catch (URISyntaxException e) {
            throw new InvocationException(e);
        }
    }

    public static List<Class> listClass(String packageName) {
        String path = packageName.replace('.', '/');
        URL pathUrl = Thread.currentThread().getContextClassLoader()
                .getResource(path);
        File dir;
        try {
            dir = new File(pathUrl.toURI());
            return getClassList(dir, packageName);
        } catch (URISyntaxException e) {
            throw new InvocationException(e);
        }
    }

    private static List<Class> getEntityClassList(File dir, String prefix) {
        List<Class> result = new LinkedList<Class>();
        for (File file : dir.listFiles())
            if (file.isDirectory())
                result.addAll(getEntityClassList(file,
                        prefix + "." + file.getName()));
            else {
                String fileName = file.getName();
                int index = fileName.lastIndexOf(".class");
                if (index > 0)
                    fileName = fileName.substring(0, index);
                Class currentClass = ClassUtils.loadClass(prefix + "."
                        + fileName);
                if (currentClass != null
                        && EntityUtils.isEntityClass(currentClass))
                    result.add(currentClass);
            }
        return result;
    }

    private static List<Class> getClassList(File dir, String prefix) {
        List<Class> result = new LinkedList<Class>();
        for (File file : dir.listFiles())
            if (file.isDirectory())
                result.addAll(getClassList(file, prefix + "." + file.getName()));
            else {
                String fileName = file.getName();
                int index = fileName.lastIndexOf(".class");
                if (index > 0)
                    fileName = fileName.substring(0, index);
                Class currentClass = ClassUtils.loadClass(prefix + "."
                        + fileName);
                if (currentClass != null)
                    result.add(currentClass);
            }
        return result;
    }

    public static <T extends Enum> T[] getEnumValues(Class<T> enumClass) {
        T[] result = enumClass.getEnumConstants();
        return result == null ? (T[]) new Object[0] : result;
    }

    /**
     * Для некоторого класса определяет каким классом был параметризован один из его предков с generic-параметрами.
     *
     * @param actualClass    анализируемый класс
     * @param genericClass   класс, для которого определяется значение параметра
     * @param parameterIndex номер параметра
     * @return класс, являющийся параметром с индексом parameterIndex в genericClass
     */
    public static Class getGenericParameterClass(final Class actualClass, final Class genericClass, final int parameterIndex) {
        // Прекращаем работу если genericClass не является предком actualClass.
        if (!genericClass.isAssignableFrom(actualClass.getSuperclass())) {
            throw new IllegalArgumentException("Class " + genericClass.getName() + " is not a superclass of " + actualClass.getName() + ".");
        }

        // Нам нужно найти класс, для которого непосредственным родителем будет genericClass.
        // Мы будем подниматься вверх по иерархии, пока не найдем интересующий нас класс.
        // В процессе поднятия мы будем сохранять в genericClasses все классы - они нам понадобятся при спуске вниз.

        // Проейденные классы - используются для спуска вниз.
        Stack<ParameterizedType> genericClasses = new Stack<ParameterizedType>();

        // clazz - текущий рассматриваемый класс
        Class clazz = actualClass;

        while (true) {
            Type genericSuperclass = clazz.getGenericSuperclass();
            boolean isParameterizedType = genericSuperclass instanceof ParameterizedType;
            if (isParameterizedType) {
                // Если предок - параметризованный класс, то запоминаем его - возможно он пригодится при спуске вниз.
                genericClasses.push((ParameterizedType) genericSuperclass);
            } else {
                // В иерархии встретился непараметризованный класс. Все ранее сохраненные параметризованные классы будут бесполезны.
                genericClasses.clear();
            }
            // Проверяем, дошли мы до нужного предка или нет.
            Type rawType = isParameterizedType ? ((ParameterizedType) genericSuperclass).getRawType() : genericSuperclass;
            if (!rawType.equals(genericClass)) {
                // genericClass не является непосредственным родителем для текущего класса.
                // Поднимаемся по иерархии дальше.
                clazz = clazz.getSuperclass();
            } else {
                // Мы поднялись до нужного класса. Останавливаемся.
                break;
            }
        }

        // Нужный класс найден. Теперь мы можем узнать, какими типами он параметризован.
        Type result = genericClasses.pop().getActualTypeArguments()[parameterIndex];

        while (result instanceof TypeVariable && !genericClasses.empty()) {
            // Похоже наш параметр задан где-то ниже по иерархии, спускаемся вниз.

            // Получаем индекс параметра в том классе, в котором он задан.
            int actualArgumentIndex = getParameterTypeDeclarationIndex((TypeVariable) result);
            // Берем соответствующий класс, содержащий метаинформацию о нашем параметре.
            ParameterizedType type = genericClasses.pop();
            // Получаем информацию о значении параметра.
            result = type.getActualTypeArguments()[actualArgumentIndex];
        }

        if (result instanceof TypeVariable) {
            // Мы спустились до самого низа, но даже там нужный параметр не имеет явного задания.
            // Следовательно из-за "Type erasure" узнать класс для параметра невозможно.
            throw new IllegalStateException("Unable to resolve type variable " + result + "." + " Try to replace instances of parametrized class with its non-parameterized subtype.");
        }

        if (result instanceof ParameterizedType) {
            // Сам параметр оказался параметризованным.
            // Отбросим информацию о его параметрах, она нам не нужна.
            result = ((ParameterizedType) result).getRawType();
        }

        if (result == null) {
            // Should never happen. :)
            throw new IllegalStateException("Unable to determine actual parameter type for " + actualClass.getName() + ".");
        }

        if (!(result instanceof Class)) {
            // Похоже, что параметр - массив или что-то еще, что не является классом.
            throw new IllegalStateException("Actual parameter type for " + actualClass.getName() + " is not a Class.");
        }

        return (Class) result;
    }

    public static int getParameterTypeDeclarationIndex(final TypeVariable typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();

        // Ищем наш параметр среди всех параметров того класса, где определен нужный нам параметр.
        TypeVariable[] typeVariables = genericDeclaration.getTypeParameters();
        Integer actualArgumentIndex = null;
        for (int i = 0; i < typeVariables.length; i++) {
            if (typeVariables[i].equals(typeVariable)) {
                actualArgumentIndex = i;
                break;
            }
        }
        if (actualArgumentIndex != null) {
            return actualArgumentIndex;
        } else {
            throw new IllegalStateException("Argument " + typeVariable.toString() + " is not found in " + genericDeclaration.toString() + ".");
        }
    }

    private static class ClassComparator implements Comparator<Class>,
            Serializable {

        public int compare(Class o1, Class o2) {
            if (o1.equals(o2))
                return 0;
            if (o1.isAssignableFrom(o2))
                return -1;
            else if (o2.isAssignableFrom(o1))
                return 1;
            else {
                Class desendant1 = o1, current = o1;
                for (; !current.isAssignableFrom(o2); current = current
                        .getSuperclass())
                    desendant1 = current;
                Class desendant2 = o2;
                for (Class cur = o2; cur != current; cur = cur.getSuperclass())
                    desendant2 = cur;
                return desendant1.getName().compareTo(desendant2.getName());
            }
        }

    }

    public static class InvocationException extends RuntimeException {
        public InvocationException(Exception cause) {
            super(cause);
        }

        public InvocationException(String cause) {
            super(cause);
        }
    }
}
