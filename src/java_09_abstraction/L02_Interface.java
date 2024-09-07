package java_09_abstraction;

interface Polygon {

    // All variables are implicitly `public static final`

    int ID = 8; // == public final static int ID = 8;
    static int K = 3; // == public final static int K = 3;

    // All methods are implicitly `public`

    // Abstract method
    void getArea(); // == public void showInfo();

    // Default method
    default void displayPerimeter() {
        System.out.println("This method can display perimeter");
        helperFunction(); // Call private method
    }

    // Static method
    static void getInformation() {
        System.out.println("This is a polygon");
    }

    // Private method - Can only be used locally within the interface
    private void helperFunction() {
        System.out.println("This is a private method");
    }
}

class Rectangle implements Polygon {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void getArea() {
        System.out.println("Area of rectangle is " + length * breadth);
    }

}

public class L02_Interface {
    public static void main(String[] args) {
        // Static constant
        System.out.println(Polygon.ID);
        System.out.println(Rectangle.ID);

        // Static method
        Polygon.getInformation();

        // Error - Static method is not shared with subclass
        // Rectangle.getInformation();

        Rectangle rectangle = new Rectangle(4, 3);

        rectangle.getArea(); // Overridden abstract method
        rectangle.displayPerimeter(); // Default method
    }
}

/*
 * ==========
 * Interface
 * ==========
 * 
 * An interface in Java is a specification of method prototypes.
 * Whenever you need to guide the programmer or, make a contract specifying
 * how the methods and fields of a type should be you can define an
 * interface.
 * 
 * We use `interface` keyword to create interfaces.
 * 
 * ===========================
 * Implementing an Interface
 * ===========================
 * 
 * Like abstract classes, we cannot create objects of interfaces.
 * 
 * To use an interface, other classes must implement it. We use the
 * implements keyword to implement an interface.
 * 
 * =================================
 * Implementing Multiple Interfaces
 * =================================
 * 
 * A class can implement multiple interfaces separated by comma.
 * 
 * But a class can extend only one parent class.
 * 
 * By convention, the implements clause follows the extends clause, if there is
 * one.
 * => public class ChildClass extends ParentClass implements Interface1,
 * Interface2
 * 
 * A class first extends then implements and then permits.
 * 
 * =======================
 * Extending an Interface
 * =======================
 * 
 * Interface can extend multiple interfaces using `extends` keyword followed by
 * comma-separated list of parent interfaces.
 * 
 * interface A {}
 * interface B {}
 * interface C extends A, B {}
 * 
 * ==========================
 * Contents of interface
 * ==========================
 * 
 * The interface body can contain:
 * 1) abstract methods
 * 2) default methods
 * 3) static methods
 * 4?) private methods
 * 
 * An interface can be empty, with no methods or variables in it.
 * 
 * All the methods inside an interface are implicitly `public` and all variables
 * are implicitly `public static final`.
 * 
 * All abstract, default, and static methods in an interface are implicitly
 * public, so you can omit the public modifier.
 * 
 * The public access specifier indicates that the interface can be used by
 * any class in any package. If you do not specify that the interface is public,
 * then your interface is accessible only to classes defined in the same
 * package as the interface.
 * 
 * Interfaces cannot have constructors.
 * 
 * 
 * =================
 * Abstract methods
 * =================
 * 
 * An abstract method within an interface is followed by a semicolon, but no
 * braces (an abstract method does not contain an implementation).
 * => void showInfo(); // Same as `public void showInfo();`
 * 
 * ================
 * Default methods
 * ================
 * 
 * Since Java 8, we can now add methods with implementation inside an interface.
 * These methods are called default methods.
 * 
 * To declare default methods inside interfaces, we use the `default` keyword.
 * 
 * Default methods are useful if we want to add new method in the interface
 * without worrying about subclasses to implement/override it.
 * 
 * Default methods are inherited like ordinary instance methods.
 * 
 * ===============
 * Static methods
 * ===============
 * 
 * Since Java 8, interfaces can have static methods.
 * 
 * We can access static methods of an interface using its references.
 * 
 * Static methods in interfaces are never inherited/shared with subclasses
 * 
 * Like abstract classes, static methods cannot be abstract.
 * 
 * ================
 * Private methods
 * ================
 * 
 * Since Java 9, interfaces can have private methods.
 * 
 * We cannot create objects of an interface. Hence, private methods are used as
 * helper methods that provide support to other methods in interfaces.
 * 
 * ===============
 * Constants
 * ===============
 * 
 * Interface can contain static constant declarations. All variables defined
 * in an interface are implicitly public, static, and final. You can
 * omit these modifiers.
 * 
 * => int K = 8; // Same as `public final static int K = 8;`
 * 
 * So, interfaces cannot contain instance variables.
 * 
 */

// https://www.baeldung.com/java-static-default-methods
