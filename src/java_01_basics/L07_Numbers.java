package java_01_basics;

public class L07_Numbers {
    public static void main(String[] args) {

        // ==============================
        // Power
        // ==============================

        // Returns double value

        System.out.println(Math.pow(2, 4)); // 16.0

        // ==============================
        // Squareroot
        // ==============================

        // Returns double value

        System.out.println(Math.sqrt(24)); // 4.898979485566356

        // ==============================
        // Cuberoot
        // ==============================

        // Returns double value

        System.out.println(Math.cbrt(125)); // 5.0

        // ==============================
        // Remainder
        // ==============================

        // Returns int value

        System.out.println(5 % 2); // 1

        // ==============================
        // Absolute value
        // ==============================

        // Integer parameter returns integer value.
        // Floating point parameter returns floating point value.

        System.out.println(Math.abs(-34234)); // 34234
        System.out.println(Math.abs(-3434.3434)); // 3434.3434

        // ===================================
        // Round the value to nearest integer
        // ===================================

        // Returns long value

        System.out.println(Math.round(3.75)); // 4

        // If you want n decimal digits, use 10^n
        double roundOff2Decimal = (double) Math.round(3.6413456 * 100) / 100;
        // double roundOff2Decimal = Math.round(3.6413456 * 100) / 100.0;

        System.out.println(roundOff2Decimal); // 3.64

        // ==============================
        // Floor and ceil value of number
        // ==============================

        // Returns double value
        System.out.println(Math.ceil(3.45)); // 4.0
        System.out.println(Math.floor(3.45)); // 3.0

        // ==============================
        // Maximum of two values
        // ==============================

        System.out.println(Math.max(5, 10)); // 10

        // ==============================
        // Minimum of two values
        // ==============================

        System.out.println(Math.min(5, 10)); // 5

        // ==============================
        // Random number
        // ==============================

        // Returns a random double number in range [0.0, 1.0)
        double random = Math.random();
        System.out.println(random); // E.g., 0.21885550282566846

        // ==============================
        // Convert string to number
        // ==============================

        int intNum = Integer.parseInt("200000"); // 200000
        long longNum = Long.parseLong("200000"); // 200000
        double doubleNum = Double.parseDouble("2333"); // 2333.000000
        double doubleNum2 = Double.parseDouble("2333.344"); // 2333.344000

        System.out.printf("%d %d %f %f", intNum, longNum, doubleNum, doubleNum2);
        System.out.println();

        // ==============================
        // Convert number to string
        // ==============================

        System.out.println(String.valueOf(123)); // "123"
        System.out.println(Integer.toString(123)); // "123"

        System.out.println(String.valueOf(34.55)); // "34.55"
        System.out.println(Double.toString(34.55)); // "34.55"

        // ==============================
        // Minimum value of numeric type
        // ==============================

        System.out.println(Integer.MIN_VALUE); // -2147483648
        System.out.println(Float.MIN_VALUE); // 1.4E-45
        System.out.println(Byte.MIN_VALUE); // -128

        // ==============================
        // Maximum value of numeric type
        // ==============================

        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Long.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);

        // ==============================
        // Infinity
        // ==============================

        double positiveInf = Double.POSITIVE_INFINITY;
        double negativeInf = Double.NEGATIVE_INFINITY;

        System.out.println(24234234 < positiveInf); // true
        System.out.println(negativeInf < positiveInf); // true
        System.out.println(positiveInf);

        // ==============================
        // Division
        // ==============================

        // int / int => int

        System.out.println(2 / 5); // 0
        System.out.println((double) 2 / 5); // 0.4
        System.out.println(7 / 3); // 2

    }

    static double getRandom(int min, int max, boolean isMaxInclusive) {
        if (isMaxInclusive) {
            return min + Math.floor(Math.random() * (max - min + 1));
        }
        // Max exclusive
        return min + Math.floor(Math.random() * (max - min));
    }
}

/*
 * =============
 * Math class
 * =============
 * 
 * Math class is part of java.lang package.
 * => java.lang.Math
 * 
 * ===========
 * Note
 * ===========
 * 
 * The parseX() methods return primitive data type whereas valueOf() methods
 * return object representation of data type.
 * 
 * Integer.parseInt("34") => int
 * Integer.valueOf(34) => Integer
 * 
 */
//
