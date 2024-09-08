package java_01_basics;

public class L04_PrimitiveTypes {
    public static void main(String[] args) {
        // Java has 8 primitive data types.

        // ===============================
        // Data types for integer values
        // ===============================

        byte myByte = 3; // 1 byte
        short myShort = 4; // 2 bytes
        int myInt = 8; // 4 bytes
        long myLong = 84L; // 8 bytes

        // Range of n bit integral type is -2^(n-1) to 2^(n-1) - 1
        // Java doesn't have separate signed or unsigned types.
        // All are signed 2's complement integers.

        // ===============================
        // Data types for decimal values
        // ===============================

        float myFloat = 45.67f; // 4 bytes (Sufficient for storing 6 to 7 decimal digits)
        double myDouble = 83.333; // 8 bytes (Sufficient for storing 15 decimal digits)

        // These types should never be used for precise values such as currency.

        // ===============================
        // Data type for boolean values
        // ===============================

        boolean myBoolean = true; // 1 bit

        // ===============================
        // Data type for character values
        // ===============================

        // Stores a single Unicode character, Unicode value of single character or
        // escape sequence of single character.

        char myChar = 'S'; // 2 bytes

        char rupee = '₹';

        // The escape sequence \u0051 in java represents the Unicode character 'Q'
        char letterQ = '\u0051'; // 'Q'

        // Unicode value of A is 65
        char letterA = 65; // 'A'

        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(myInt);
        System.out.println(myLong);
        System.out.println(myFloat);
        System.out.println(myDouble);
        System.out.println(myBoolean);
        System.out.println(myChar);
        System.out.println(rupee);
        System.out.println(letterQ);
        System.out.println(letterA);
        System.out.println(Integer.toHexString((int) rupee));
    }
}
