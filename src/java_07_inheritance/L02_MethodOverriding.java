
package java_07_inheritance;

class A {
    public void displayInfo() {
        System.out.println("I am A.");
    }
}

class B extends A {
    @Override
    public void displayInfo() {
        System.out.println("I am B.");
    }
}

public class L02_MethodOverriding {
    public static void main(String[] args) {
        B b = new B();
        b.displayInfo();
    }
}

/*
 * ==================
 * Method overriding
 * ==================
 * 
 * If the same method is defined in both the superclass and the subclass, then
 * the method of the subclass overrides the method of the superclass. This
 * is known as method overriding.
 * 
 * The @Override annotation is used to tell the compiler that we are
 * overriding a method. However, the annotation is not mandatory.
 * 
 * ========================
 * Method overriding rules
 * ========================
 * 
 * 1. Both the superclass and the subclass must have the same method name and
 * the same parameter list.
 * 
 * 2. The access specifier of subclass method should be same or wider than
 * access specifier of the superclass method. We cannot reduce visibility.
 * 
 * 3. The return type of the subclass' method should be either same or subtype
 * of the return type of the superclass' method.
 * 
 * Superclass return type => Subclass return type:
 * - Shape => Circle
 * - Object => Integer
 * 
 * 4. We cannot override the method declared as final or static.
 * 
 * Static methods can be hidden by creating method with same name and parameters
 * in the subclass.
 * 
 * 5. We should always override abstract methods of the superclass.
 * 
 * 
 * =============
 * Constructors
 * =============
 * 
 * It is important to note that constructors in Java are not inherited.
 * 
 * Hence, there is no such thing as constructor overriding in Java.
 * 
 */