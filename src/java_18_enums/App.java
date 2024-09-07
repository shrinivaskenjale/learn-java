package java_18_enums;

// Enum is nothing but a class which extends java.lang.Enum class
// enum Size {
// These are instances of Size class
//     SMALL, MEDIUM, LARGE, EXTRALARGE
// Semicolon is optional after list
// }

enum Size {

    // enum constants calling the enum constructors
    SMALL("The size is small."),
    MEDIUM("The size is medium."),
    LARGE("The size is large."),
    EXTRALARGE("The size is extra large.");

    // Instance variables are implicitly `private` and `final`.
    private final String pizzaSize;

    // private enum constructor
    // Enum constructors are implicitly private. They can't be public.
    private Size(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public String getSize() {
        return pizzaSize;
    }
}

public class App {
    public static void main(String[] args) {
        System.out.println(Size.SMALL);
        System.out.println(Size.MEDIUM);

        Size pizzaSize = Size.SMALL;

        switch (pizzaSize) {
            // For case values don't prefix enum type.
            case EXTRALARGE:
                System.out.println("Extra-large size pizza");
                break;
            case LARGE:
                System.out.println("Large size pizza");
                break;
            case MEDIUM:
                System.out.println("Medium size pizza");
                break;
            case SMALL:
                System.out.println("Small size pizza");
                break;
            default:
                System.out.println("Unknown size pizza");
                break;

        }

        // Enums are instances of class of enum type
        System.out.println(Size.SMALL.getClass());
        System.out.println(Size.SMALL instanceof Size);

        // Accessing instance method
        System.out.println(Size.MEDIUM.getSize());

        // ========
        // ordinal()
        // ========

        // The ordinal() method returns the position of an enum constant.
        // 0 based

        System.out.println(Size.LARGE.ordinal());

        // ============
        // compareTo()
        // ============

        // The compareTo() method compares the enum constants based on their ordinal
        // value.
        // Returns 0 if equal

        System.out.println(Size.SMALL.compareTo(Size.SMALL));
        System.out.println(Size.SMALL.compareTo(Size.LARGE));

        // ===========
        // toString()
        // ===========

        // The toString() method returns the string representation of the enum
        // constants.

        // The default string representation of an enum constant is the name of the same
        // constant.

        // We can change the default string representation of enum constants by
        // overriding the toString() method.
        // Syntax is different. Check it.

        System.out.println(Size.LARGE.toString());

        // =========
        // name()
        // =========

        // The name() method returns the defined name of an enum constant in string
        // form.

        System.out.println(Size.EXTRALARGE.name());

        // ==============
        // valueOf()
        // ==============

        // The valueOf() method returns enum constant of specified name.

        Size theSize = Size.valueOf("SMALL");
        System.out.println(theSize);

        // ================
        // values()
        // ================

        // The values() method returns an array of enum type containing all the enum
        // constants.

        Size[] enumArray = Size.values();
        System.out.println(enumArray[0]);
    }
}

/*
 * =======
 * Enums
 * =======
 * 
 * In Java, an enum (short for enumeration) is a type that has a fixed set of
 * constant values called enum constants(values).
 * 
 * We use the enum keyword to declare enums.
 * 
 * The enum constants are usually represented in uppercase.
 * 
 * We use the enum name to access the constant values.
 * => Size.SMALL
 * 
 * We can create variables of enum types.
 * => Size pizzaSize;
 * 
 * ========================
 * Enum and class relation
 * ========================
 * 
 * In Java, enum types are considered to be a special type of class.
 * 
 * An enum class can include methods, fields and constructors just like regular
 * classes.
 * 
 * When we create an enum class, the compiler will create instances (objects) of
 * each enum constants. Also, all enum constant is always public static final by
 * default.
 * 
 * =======================
 * Why enum?
 * =======================
 * 
 * Enum was introduced to replace the use of int constants.
 * 
 * class Size {
 * public final static int SMALL = 1;
 * public final static int MEDIUM = 2;
 * public final static int LARGE = 3;
 * public final static int EXTRALARGE = 4;
 * }
 * 
 * 
 * Enum provides compile-time type safety.
 * 
 * When we declare variable of enum type, it is guarnateed that the variable
 * will hold one of the enum constants. If we assign different value, compiler
 * generates error.
 */
