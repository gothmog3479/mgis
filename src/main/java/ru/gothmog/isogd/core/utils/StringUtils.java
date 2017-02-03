package ru.gothmog.isogd.core.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StringUtils {
    private static int ACCURACY = 6;

    public StringUtils() {
        super();
    }

    private static String trimZeros(String str) {
        if (str.equals("0.0"))
            return str;
        String[] s = str.split("\\.");
        if (s.length > 1) {
            int length = str.length();
            int end = length;
            while (end != s[0].length() + 1 + 2) {
                Character ch = str.charAt(end - 1);
                if (ch.equals("0")) {
                    end--;
                } else
                    break;
            }
            str = str.substring(0, end);
        }
        return str;
    }

    private static String parse(String s, int sign) {
        if (s.indexOf("E") > 0) {
            int degree = Integer.parseInt(s.substring(s.indexOf("E") + 1));
            s = s.substring(0, s.indexOf("E"));
            String[] ss = s.split("\\.");
            s = "";
            for (int i = 0; i < ss.length; i++) {
                s += ss[i];
            }
            if (sign < 0)
                s = s.substring(1, s.length());

            if (degree > 0) {
                int length = 1 + degree;
                while (s.length() < length)
                    s += "0";
                if (s.length() != length)
                    s = s.substring(0, degree + 1) + "."
                            + s.substring(degree + 1);
                if (sign < 0)
                    s = "-" + s;
            } else {
                String zeroes = "";
                degree = Math.abs(degree);
                for (int i = 0; i < degree - 1; i++)
                    zeroes += "0";
                s = "0." + zeroes + s;
            }
        }
        return s;
    }

    public static String parseDoubletoString(Double value) {
        if (value == null)
            return "";
        String s = value.toString();
        int sign = value >= 0.0 ? 1 : -1;
        s = parse(s, sign);
        if (value < 1)
            s = trimZeros(s);
        return s;
    }

    public static long nod(long a, long b) {
        if (a < b) {
            a ^= (b ^= a);
            b ^= a;
        }
        while (b != 0) {
            b ^= a %= b;
            b ^= a ^= b;
        }
        return a;
    }

    public static String decToFraction(double dec) {
        if (dec == 0)
            return "0";
        try {
            Double value = dec;
            long intValue = value.longValue();
            double fracValue = value - intValue;
            long denominator = (long) Math.pow(10, ACCURACY);
            long nominator = (long) (fracValue * denominator);
            long ref = nod(nominator, denominator);
            nominator /= ref;
            denominator /= ref;
            if (nominator == 0)
                return "0";
            return Long.toString(nominator + denominator * intValue) + "/"
                    + Long.toString(denominator);
        } catch (Exception e) {
            return "0";
        }
    }

    public static double fractionToDouble(String in) {
        try {
            String[] t = in.split("/");

            if (t.length == 1) {
                t[0] = t[0].replace(",", ".");
                return (Double.parseDouble(t[0]));
            } else if (t.length == 2) {
                return (Double.parseDouble(t[0]) / Double.parseDouble(t[1]));
            } else {
                return 0.0;
            }
        } catch (Exception e) {
            return 0.0;
        }
    }

    public static String implode(Collection<? extends CharSequence> elements,
                                 CharSequence delimeter) {
        StringBuilder result = new StringBuilder();
        boolean first = true;
        for (CharSequence element : elements) {
            if (!first)
                result.append(delimeter);
            else
                first = false;
            result.append(element);
        }
        return result.toString();
    }

    public static String accurateImplode(Collection<String> elements,
                                         String delimeter) throws StringProcessException {
        StringBuilder result = new StringBuilder();
        boolean first = true;
        for (String element : elements) {
            if (!first)
                result.append(delimeter);
            else
                first = false;
            if (!isEmpty(element) && element.indexOf(delimeter) >= 0)
                throw new StringProcessException("");
            result.append(element);
        }
        return result.toString();
    }

    public static Collection<String> explode(String string, String delimeter) {
        List<String> result = new ArrayList<String>();
        if (isEmpty(string))
            return result;
        int pos1 = 0;
        int pos2 = 0;
        while ((pos2 = string.indexOf(delimeter, pos1)) >= 0) {
            result.add(string.substring(pos1, pos2));
            pos1 = pos2 + delimeter.length();
        }
        if (pos1 < string.length())
            result.add(string.substring(pos1));
        return result;
    }

    public static boolean isEmpty(String element) {
        return element == null || element.trim().isEmpty();
    }

    public static String trimToLength(String string, Integer maxLength) {
        String tmp = string.substring(0, maxLength);
        if (string.length() > maxLength)
            tmp += "...";

        return tmp;
    }

    public static String formatDouble2Sign(Double val) {
        if (val != null) {
            return String.format("%1$,.2f", val);
        } else {
            return "";
        }
    }

    public static class StringProcessException extends RuntimeException {

        public StringProcessException() {
            super();
        }

        public StringProcessException(String message) {
            super(message);
        }

        public StringProcessException(String message, Throwable cause) {
            super(message, cause);
        }

        public StringProcessException(Throwable cause) {
            super(cause);
        }
    }
}
