package ru.gothmog.isogd.core.utils;

import ru.gothmog.isogd.entity.IsogdEntity;
import ru.gothmog.isogd.entity.registry.RegistryItemTransferObject;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

/**
 * Класс для работы с сущностями через Reflection API
 * в процессе выполнения можно будет :
 * Определить класс объекта.
 * Получить информацию о модификаторах класса, полях, методах, конструкторах и суперклассах.
 * Выяснить, какие константы и методы принадлежат интерфейсу.
 * Создать экземпляр класса, имя которого неизвестно до момента выполнения программы.
 * Вызвать метод объекта.
 * Создать новый массив, размер и тип компонентов которого неизвестны до момента выполнения программ.
 *
 * @author d.grushetskiy
 */
public class EntityUtils {

    public EntityUtils() {
    }

    /**
     * Метод определяет актуальность класса в процессе выполнения, его имя
     * наличие элементов $, и его отсутвие а также наличие суперклассов
     *
     * @param cls
     * @return
     */
    public static Class getActualClass(Class cls) {
        while (cls.getName().contains("$") && cls != null)
            cls = cls.getSuperclass();
        return cls;
    }

    /**
     * Метод определяет методы  которые использует класс владелец
     *
     * @param owner
     * @return
     */
    public static Method getIdentifierGetter(Class owner) {
        for (Method ms : owner.getMethods())
            if (ms.getAnnotation(Id.class) != null)
                return ms;
        throw new RuntimeException(
                "Unable to get identifier getter for class. " + owner.getName()
                        + " Perhaps non-entity object.");
    }

    public static Serializable getIdentifier(Object target) {
        Method getter = getIdentifierGetter(getActualClass(target.getClass()));
        return (Serializable) (getter != null ? ClassUtils.invokeMethod(getter,
                target) : null);
    }

    public static Method getIdentifierSetter(Class owner) {
        Method setter = ClassUtils
                .getSetterForGetter(getIdentifierGetter(owner));
        if (setter == null)
            throw new RuntimeException(
                    "Unable to get identifier getter for class. "
                            + owner.getName() + " Perhaps non-entity object.");
        return setter;
    }

    public static void setIdentifier(Object target, Serializable identifier) {
        if (target == null)
            return;
        Method setter = getIdentifierSetter(getActualClass(target.getClass()));
        ClassUtils.invokeMethod(setter, target, identifier);
    }

    public static boolean isEntityClass(Class targetClass) {
        if (targetClass.isAnnotationPresent(Entity.class)
                || targetClass.isAnnotationPresent(MappedSuperclass.class))
            return true;
        else {
            targetClass = getActualClass(targetClass);
            return targetClass.isAnnotationPresent(Entity.class)
                    || targetClass.isAnnotationPresent(MappedSuperclass.class);
        }
    }

    public static String getEntityName(Class entityClass) {
        if (isEntityClass(entityClass)) {
            String name;
            Entity entityAnn = (Entity) entityClass.getAnnotation(Entity.class);
            if (entityAnn != null) {
                name = entityAnn.name();
            } else {
                return entityClass.getSimpleName();
            }
            if (!StringUtils.isEmpty(name))
                return name;
            else
                return entityClass.getSimpleName();
        } else
            throw new RuntimeException(
                    "Not entity class, where entity expected");

    }

    public static URI getObjectURI(String unitName, Object object,
                                   String property) {
        if (object == null || getIdentifier(object) == null)
            return null;
        String scheme = "jpa", autority = unitName, path = "/"
                + getEntityName(getActualClass(object.getClass())), paramName = ClassUtils
                .parsePropName(getIdentifierGetter(
                        getActualClass(object.getClass())).getName()), paramValue = getIdentifier(
                object).toString();
        try {
            return new URI(scheme, autority, path,
                    paramName + "=" + paramValue, property);
        } catch (URISyntaxException ex) {
            throw new RuntimeException("Connot format URI", ex);
        }
    }

    public static String generateQueryForURI(URI objectURI) {
        if (objectURI == null)
            return "";
        if (!"jpa".equals(objectURI.getScheme()))
            throw new RuntimeException("Invalid scheme "
                    + objectURI.getScheme() + ". 'jpa' expected");
        String entityName = objectURI.getPath();
        entityName = StringUtils.isEmpty(entityName) ? entityName : entityName
                .substring(1);
        if (StringUtils.isEmpty(entityName))
            throw new RuntimeException("Invalid (empty) entityName");
        String query = objectURI.getQuery();
        String predicate = "";
        if (!StringUtils.isEmpty(query)) {
            predicate = query.replace("&", " AND OBJ.").trim();
            predicate = predicate.isEmpty() ? "" : " WHERE " + "OBJ."
                    + predicate;
        }
        String projection = objectURI.getFragment();
        projection = !StringUtils.isEmpty(projection) ? "." + projection : "";
        return "SELECT OBJ" + projection + " FROM " + entityName + " OBJ"
                + predicate;
    }

    public static List<Object> loadObjects(URI objectURI) {
        /*
		 * if(objectURI == null) return Collections.emptyList(); EntityManager
		 * em = PersistenceManager.getFactory(objectURI.getAuthority()).
		 * createEntityManager(); Query q =
		 * em.createQuery(generateQueryForURI(objectURI)); return
		 * q.getResultList();
		 */
        throw new UnsupportedOperationException("TODO");
    }

    public static boolean defaultEquals(Object obj1, Object obj2) {
        if (obj1 == obj2) {
            return true;
        }

        if (obj1 != null && obj2 != null
                && obj1.getClass().equals(obj2.getClass())) {

            if (obj1 instanceof IsogdEntity) {
                IsogdEntity ent1 = (IsogdEntity) obj1;
                IsogdEntity ent2 = (IsogdEntity) obj2;

                if (ent1.getId() != null && ent2.getId() != null) {
                    return ent1.getId().equals(ent2.getId());
                }
            } else if (obj1 instanceof RegistryItemTransferObject) {
                RegistryItemTransferObject ent1 = (RegistryItemTransferObject) obj1;
                RegistryItemTransferObject ent2 = (RegistryItemTransferObject) obj2;

                if (ent1.getId() != null && ent2.getId() != null) {
                    return ent1.getId().equals(ent2.getId());
                }
            }
        }

        return false;
    }
}
