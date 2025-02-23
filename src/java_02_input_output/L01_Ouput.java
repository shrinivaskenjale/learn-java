package java_02_input_output;

public class L01_Ouput {
    public static void main(String[] args) {
        // ========
        // Output
        // ========

        // We can use following methods to send output to standard output (screen).
        // 1. System.out.println()
        // 2. System.out.print()
        // 3. System.out.printf()

        // System is a class.
        // out is a public static field: it accepts output data.
        // We can print Strings, variables and literals using these methods.

        // =====================
        // System.out.println()
        // =====================

        // println() adds newline character at the end of string.
        System.out.println("This is some text.\tThis was a tab.\nThis was a newline.");

        // ===================
        // System.out.print()
        // ===================

        // print() does not add newline character at the end of string.
        System.out.print("This is some text. ");
        System.out.print("This is more text.\n");

        // =====================
        // System.out.printf()
        // =====================

        // It provides string formatting (similar to printf in C/C++)

        // 1. Integers
        System.out.printf("\nThis is integer: %d", 454);
        System.out.printf("\nThis is integer with width of 10 characters and aligned to right: %10d", 454);
        System.out.printf("\nThis is integer with width of 10 characters and aligned to left: %-10d!", 454);
        System.out.printf(
                "\nThis is integer with width of 10 characters and aligned to right with padding of 0s: %010d!", 454);

        // Here width is minimum width. If number is longer than width then actual width is taken.

        // 2. Strings
        System.out.printf("\nMy name is %s", "Shrinivas");
        System.out.printf("\nMy name is %20s", "Shrinivas");

        // 3. Floating values
        System.out.printf("\nTotal price is %f", 23.8);
        System.out.printf("\nTotal price with precision of 3 decimal places is %.3f", 23.8);
        System.out.printf("\nTotal price with precision of 2 decimal places is %.2f", 3456.358);
        System.out.printf("\nTotal price with precision of 2 decimal places and width of 10 characters is %10.2f",
                3456.358);

        // Width includes digits before & after the decimal point along with the decimal point.

        System.out.println();

        // ===================
        // String.format()
        // ===================

        // String.format() : Returns string by formatting same as printf()
        String result = String.format("My name is %s.", "Shrinivas");
        System.out.println(result);
    }
}

// https://www.cs.colostate.edu/~cs160/.Summer16/resources/Java_printf_method_quick_reference.pdf

/*

====================
Format Specifiers
====================

%c = char
%s = String
%d = byte, short, int, long
%f = float, double

*/
