package java_12_type_casting;

public class L01_TypeCasting {
    public static void main(String[] args) {

        byte byteValue = 45;
        short shortValue = 67;
        int intValue = 32423;
        long longValue = 2442342; // Implicit conversion int to long
        long longValue2 = 2432434242345435L;

        float floatValue = 343.34f;
        double doubleValue = 3434.343;

        // System.out.println(Integer.MAX_VALUE);
        // System.out.println(Integer.MIN_VALUE);
        // System.out.println(Byte.MAX_VALUE);
        // System.out.println(Byte.MIN_VALUE);

        // =========================
        // Implicit conversion
        // =========================

        // Implicit conversion: smaller to larger data type
        doubleValue = shortValue;
        System.out.println(doubleValue);

        // Implicit conversion does not occur when converting larger data type into
        // smaller data type.
        // intValue = longValue; // error

        // =========================
        // Explicit conversion
        // =========================

        // Explicit conversion: larger to smaller data type
        intValue = (int) longValue;
        // This is possible because current value in longValue is in the range of int
        // data type. If number was larger, it would give unexpected output.
        System.out.println(intValue);
        System.out.println((int) longValue2); // unexpected output

        intValue = (int) floatValue;
        // Above conversion does not round off the value. To round off values use
        // Math.round() function.
        System.out.println(intValue);

        // Be careful when doing explicit data type conversion. Make sure to convert
        // value which lies in the range of smaller data type otherwise we get
        // unexpected results.
        shortValue = (short) longValue;
        System.out.println(shortValue); // unexpected output
        byteValue = (byte) 130;
        System.out.println(byteValue); // unexpected output

        // Although float is 4 bytes and long is 8 bytes, still float is considered
        // larger data type. So implicit conversion cannot happen.
        // long n = 3.4f; // Error
        long n = (long) 3.4f;
        System.out.println(n);
    }

}

/*
 * ==============
 * Type Casting
 * ==============
 * 
 * The process of converting the value of one data type to another data type is
 * known as typecasting.
 * 
 * https://docs.oracle.com/javase/specs/jls/se10/html/jls-5.html
 * 
 * There are 2 major types of type casting:
 * 1. Widening
 * 2. Narrowing
 * 
 * =======================
 * Widening Type Casting
 * =======================
 * 
 * In Widening Type Casting, Java automatically converts one data type to
 * another data type.
 * 
 * E.g., Converting int to double
 * int num = 10;
 * double data = num;
 * 
 * In the case of Widening Type Casting, the lower data type (having smaller
 * size) is converted into the higher data type (having larger size). Hence
 * there is no loss in data. This is why this type of conversion happens
 * automatically.
 * 
 * Note: This is also known as Implicit Type Casting.
 * 
 * ========================
 * Narrowing Type Casting
 * ========================
 * 
 * In Narrowing Type Casting, we manually convert one data type into another
 * using the parenthesis.
 * 
 * E.g., Converting double into an int
 * double num = 10.99;
 * int data = (int)num;
 * 
 * Here, the int keyword inside the parenthesis indicates that that the num
 * variable is converted into the int type.
 * 
 * In the case of Narrowing Type Casting, the higher data types (having larger
 * size) are converted into lower data types (having smaller size). Hence there
 * is the loss of data. This is why this type of conversion does not happen
 * automatically.
 * 
 * Note: This is also known as Explicit Type Casting.
 * 
 * 
 */