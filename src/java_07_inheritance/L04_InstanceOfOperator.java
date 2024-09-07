package java_07_inheritance;

import java.util.ArrayList;
import java.util.List;

public class L04_InstanceOfOperator {
    public static void main(String[] args) {
        Dog dog = new Dog();

        // Inheritence chain: Dog -> Animal -> Object
        System.out.println(dog instanceof Dog); // true
        System.out.println(dog instanceof Animal); // true

        // In Java, all the classes are inherited from the Object class. So, instances
        // of all the classes are also an instance of the Object class.
        System.out.println(dog instanceof Object); // true

        // ArrayList implements List interface
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list instanceof List); // true

        // We can't check primitive types.
        // System.out.println(5 instanceof Integer); // Error
        System.out.println(Integer.valueOf(5) instanceof Integer); // Works
    }
}

/*
 * 
 * The `instanceof` operator in Java is used to check whether an object is an
 * instance of a particular class or not.
 * 
 * Syntax: <object> instanceOf <class or interface>;
 * 
 * First operand should be object i.e., reference type.
 * 
 * It returns boolean.
 * 
 * We can use the instanceof operator to check if objects of the subclass is
 * also an instance of the superclass.
 * 
 * The instanceof operator is also used to check whether an object of a class is
 * also an instance of the interface implemented by the class.
 * 
 */