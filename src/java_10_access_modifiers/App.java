package java_10_access_modifiers;

public class App {

    // Order of modifiers doesn't matter.
    public final static int luckyNumber = 45;
    // Above statement is same as:
    // static public final int luckyNumber = 45;

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("TVS", "Jupiter", 2018, "Starlight Blue");

        System.out.println(vehicle.make); // public
        System.out.println(Vehicle.STATE); // public
        System.out.println(vehicle.model); // protected
        System.out.println(vehicle.year); // default
        // System.out.println(vehicle.color); // private
    }
}

/*
 * 
 * =================================================
 * Access Modifiers
 * =================================================
 * 
 * In Java, access modifiers are used to set the accessibility (visibility) of
 * classes, interfaces, variables, methods, constructors.
 * 
 * ==========================================
 * Classes, Interfaces, Enums & Annotations
 * ==========================================
 * 
 * For classes, interfaces and other top level declarations, you can
 * use either public or default:
 * 
 * 1) public
 * - The class is accessible by any class in any package.
 * 
 * 2) default
 * - The class is only accessible by classes in the same package.
 * - This is used when you don't explicitly specify any access modifier.
 * 
 * 
 * Java file should have at most 1 PUBLIC type (class, interface etc). So, if
 * file contains PUBLIC class, then name of the file should be same as that
 * class name.
 * 
 * We cannot declare class/interface with private or protected access
 * specifiers.
 * 
 * Nested/inner classes can be private.
 * 
 * ========
 * Members
 * ========
 * 
 * For variables, methods and constructors, you can use the one of the
 * following:
 * 
 * 1) public
 * - The member is accessible in all classes in any package.
 * 
 * 2) private
 * - The member is accessible only within the same class.
 * - We use getters and setters to access private variables of a class outside.
 * - Even subclass can't access private members of the class.
 * 
 * 3) default
 * - The member is only accessible in the classes of the same package.
 * - This is used when you don't specify any modifier.
 * 
 * 4) protected
 * - The member is accessible in the classes of the same package and the
 * subclasses in any packages.
 * 
 * 
 * 
 * 
 * ==================
 * Restriction level
 * ==================
 * 
 * private < default < protected < public
 * 
 * ==============
 * Encapsulation
 * ==============
 * 
 * https://www.programiz.com/java-programming/encapsulation
 * 
 * Encapsulation in Java is a process of wrapping code and data
 * together into a single unit.
 * 
 * Encapsulation is useful for data hiding and getting control over the data.
 * 
 * Access modifiers are mainly used for encapsulation. It can help us to control
 * what part of a program can access the members of a class. So that misuse of
 * data can be prevented.
 * 
 */