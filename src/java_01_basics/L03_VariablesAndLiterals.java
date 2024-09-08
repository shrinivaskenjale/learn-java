package java_01_basics;

public class L03_VariablesAndLiterals {
    public static void main(String[] args) {


//        Here, speedLimit is a variable of int data type, and we have assigned value 80
//        to it. We have assigned value to the variable during declaration.
        int speedLimit = 80;

        // You can declare variables and assign variables separately.
        int distance;
        distance = 180;

        // Value of variable can be changed
        speedLimit = 100;

        System.out.println(speedLimit);
        System.out.println(distance);

        // =========
        // Literals
        // =========

        // Here, 1, 2.5, and 'F' are literals.
        int a = 1;
        double b = 2.5;
        char c = 'F';

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // =================
        // Integer Literals
        // =================

        // In Java, binary literal starts with 0b, octal literal starts with 0, and
        // hexadecimal literal starts with 0x.

        // Integer literals are used to initialize variables of integer types like byte,
        // short, int, and long.

        // binary
        int binaryNumber = 0b10010;

        // octal
        int octalNumber = 027;

        // decimal
        int decNumber = 34;

        // hexadecimal
        int hexNumber = 0x2F;

        // Literals of long type have `l` or `L` as suffix.
        long longNumber = 43453543534345345L;

        System.out.println(binaryNumber);
        System.out.println(octalNumber);
        System.out.println(decNumber);
        System.out.println(hexNumber);
        System.out.println(longNumber);

        // ========================
        // Floating-point Literals
        // ========================

        // The floating-point literals are used to initialize float and double type
        // variables.

        // Literals of float type have `f` or `F` as suffix.
        float myFloat = 3.4f;

        double myDouble = 3.4;

        double myDoubleScientific = 3.445e2; // 3.445 * 10^2

        System.out.println(myDouble);
        System.out.println(myFloat);
        System.out.println(myDoubleScientific);

        // ===================
        // Character Literals
        // ===================

        // Character literals are Unicode characters enclosed inside single quotes.
        // We can also use Unicode escape sequences as character literals.
        // We can also assign Unicode value number.

        char letter = 'a';

        char rupees = '\u20B9';

        // Binary, Octal, Decimal & Hexadecimal literals can be used.
        char letterA = 65; // A

        System.out.println(letter);
        System.out.println(rupees);
        System.out.println(letterA);

        // ================
        // String Literals
        // ================

        // A string literal is a sequence of characters enclosed inside double-quotes.

        String str1 = "Java Programming";
        System.out.println(str1);

        // =================
        // Boolean Literals
        // =================

        boolean flag1 = false;
        boolean flag2 = true;

        System.out.println(flag1);
        System.out.println(flag2);

        // =================
        // Block and Scope
        // =================

//        int data = 10; // Error
        {
            String data = "Ten";
            System.out.println(data);
        }
        int data = 10;
        System.out.println(data);

    }
}

/*
 * ===========================
 * Variables:
 * ===========================
 *
 * Java is a statically-typed language. It means that all variables must be
 * declared before they can be used.
 *
 * A variable is a location in memory (storage area) to hold data.
 * The value of a variable can be changed in the program, hence the name
 * variable.
 * To indicate the storage area, each variable should be given a unique name
 * (identifier).
 *
 *
 * ===========
 * Keywords
 * ===========
 *
 * Keywords are predefined, reserved words used in programming language that
 * have special meanings to the compiler.
 *
 * E.g., int, char, extends, import etc.
 *
 * You cannot use keywords as variable name (or identifiers).
 *
 * =============
 * Identifiers
 * =============
 *
 * Identifiers are the name given to variables, classes, methods, etc.
 *
 * ===========================
 * Rules for naming variables:
 * ===========================
 *
 * 1. Java is case sensitive. Hence, age and AGE are two different variables.
 *
 * 2. Variables can contain letters, underscores, dollar signs and digits.
 *
 * 3. Variables must start with either a letter or an underscore(_) or a
 * dollar($) sign.
 *
 * 4. Variable names cannot start with numbers.
 *
 * ===========================
 * Literals:
 * ===========================
 *
 * Literals are data used for representing fixed values. They can be used
 * directly in the code.
 *
 * ===========================
 * Block & Scope:
 * ===========================
 *
 * A block is a group of statements (zero or more) that is enclosed in curly
 * braces { }.
 *
 * Variables declared inside {} are accessible inside {} only.
 *
 * You can't change data type of variable declared once in the same scope.
 *
 *
 */