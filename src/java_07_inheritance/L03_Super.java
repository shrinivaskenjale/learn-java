package java_07_inheritance;

class Shape {
    String type = "SHAPE";

    Shape() {
        System.out.println("Shape constructor");
    }

    // Overridden method
    public void display() {
        System.out.println("This is a Shape");
    }
}

class Square extends Shape {

    String type = "SQUARE";

    Square() {
        // Explicitly call the constructor of superclass
        super(); // Needs to be first statement
        System.out.println("Square constructor");
    }

    // Overriding method
    @Override
    public void display() {
        System.out.println("This is a Square");
    }

    public void printMessage() {

        // Call overriding method in subclass
        display();

        // Call overridden method in superclass
        super.display();
    }

    public void printType() {
        System.out.println("Type from subclass: " + type);
        System.out.println("Type from superclass: " + super.type);
    }
}

public class L03_Super {
    public static void main(String[] args) {
        Square square = new Square();
        square.printMessage();
        square.printType();
    }
}
/*
 * ===========
 * super
 * ===========
 * 
 * The `super` keyword in Java is used in subclasses to access superclass
 * members (variables, constructors and methods).
 * 
 * ============================================
 * Access Overridden Methods of the superclass
 * ============================================
 * 
 * We use super if the overridden method of superclass needs to be
 * called.
 * 
 * => super.method()
 * 
 * ====================================
 * Access variables of the Superclass
 * ====================================
 * 
 * The superclass and subclass can have variables with the same name. The
 * subclass' variable hides superclass' variable. This is called variable
 * hiding.
 * 
 * Data type does not matter. Only identifier must be same.
 * 
 * We use the super keyword to access the variable of the superclass.
 * 
 * => super.variable
 * 
 * ==============================
 * Access superclass constructor
 * ==============================
 * 
 * To explicitly call the superclass constructor from the subclass constructor,
 * we use super().
 * 
 * super() can be used only inside the subclass constructor and must be the
 * first statement.
 * 
 * Using super() is not compulsory. Even if super() is not used in the subclass
 * constructor, the compiler implicitly calls the default/no-arg constructor of
 * the superclass.
 * => It is best practice to create empty no-arg constructor if you are creating
 * parameterized constructor in any class.
 * 
 * The compiler can automatically call the no-arg constructor. However, it
 * cannot call parameterized constructors.
 * 
 * If parameterized constructor of the superclass has to be called from the
 * subclass constructor then we should explicitly call the super() with required
 * arguments.
 */