package java_01_basics;

public class L06_Operators {
    public static void main(String[] args) {
        // =======================
        // Division operator: /
        // =======================

        // If we use the division operator with two integers, then the resulting
        // quotient will also be an integer. And, if one of the operands is a
        // floating-point number, the result will also be in floating-point.

        System.out.println(9 / 2); // 4
        System.out.println(9.0 / 2); // 4.5
        System.out.println(9 / 2.0); // 4.5
        System.out.println(9.0 / 2.0); // 4.5

        // ===========================================
        // Bitwise operators
        // ===========================================

        // Bitwise & shift operators perform operations on integer data at the
        // individual bit-level. Here, the integer data includes byte, short, int, and
        // long types of data.

        // https://www.geeksforgeeks.org/bitwise-operators-in-java/
        // https://www.programiz.com/java-programming/bitwise-operators

        // AND - &
        // OR - |
        // NOT - ~
        // XOR - ^

        // ==================
        // Shift Operators
        // ==================

        // SIGNED LEFT SHIFT - <<
        // Shifts bits to the left by specified no. of positions. The leftmost bits are
        // discarded, and the rightmost bits are filled with zeroes.

        // SIGNED RIGHT SHIFT - >>
        // Shifts bits to the right by specified no. of positions. The rightmost bits
        // are discarded, and the leftmost bits are filled with the sign bit (0 for +ve
        // numbers, 1 for -ve numbers).

        // UNSIGNED RIGHT SHIFT - >>>
        // Shifts bits to the right by specified no. of positions. It fills the leftmost
        // bits with zeros regardless of the sign of the original number. This operand
        // treats the operand as an unsigned value.

        // UNSIGNED LEFT SHIFT - <<< doesn't exist in Java.
        // To remember, right is right >> >>> <<

        System.out.println(Integer.toBinaryString(-8));
        System.out.println(Integer.toBinaryString(-8 >> 3));
        System.out.println(Integer.toBinaryString(-8 >>> 3));
        System.out.println(Integer.toBinaryString(8));
        System.out.println(Integer.toBinaryString(8 >> 3));
        System.out.println(Integer.toBinaryString(8 >>> 3));

        System.out.println(Integer.toBinaryString(-8));
        System.out.println(Integer.toBinaryString(-8 << 3));
        System.out.println(Integer.toBinaryString(8));
        System.out.println(Integer.toBinaryString(8 << 3));

        // ====================
        // instanceof operator
        // ====================

        // The instanceof operator checks whether an object is an instanceof a
        // particular class or superclass.

        System.out.println("abc" instanceof String); // true
        System.out.println("abc" instanceof Object); // true

        // =========================
        // Assignment expression
        // =========================

        // In Java, variable assignment is an expression.
        // Assignment expression returns the value that is being assigned.
        // So, we can use an assignment expression as part of a larger expression.

        // Example 1
        int a = 2;
        int b = (a = 4);
        System.out.println(a + " " + b);

        // Example 2
        System.out.println((b = 18) == 18);

        // Declaration can't be used
        // System.out.println((int b = 18) == 18); // Error

        // Example 3
        int x, y;
        x = y = 45;
        System.out.println(x + " " + y);

    }
}

/*
====================
Types of operators
====================

1. Arithmetic Operators: + - / * %

2. Assignment Operators: = += -=

3. Relational Operators: == != > < >= <=

4. Logical Operators: && || !

5. Unary Operators: + - ++ --

6. Bitwise Operators: ~ | & ^

7. Shift Operators: >> << >>>

8. Ternary Operators: ?:

9. instanceof operator



====================
Property of XOR:
====================

a ^ a = 0
a ^ 0 = a


==========================================
Precedence & Associativity of Operators
==========================================

https://www.programiz.com/java-programming/operator-precedence


*/