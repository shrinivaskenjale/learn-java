package java_13_generics;

import java.util.ArrayList;

// Generics: https://docs.oracle.com/javase/tutorial/java/generics/why.html

// Generic class is a class that can work with other types of objects and you can specify 
// what type that would be when you instantiate the generic class using type parameters.

class Machine {

    @Override
    public String toString() {
        return "I am a machine";
    }

    public void start() {
        System.out.println("Machine started");
    }

}

class Camera extends Machine {

    @Override
    public String toString() {
        return "I am a camera";
    }
}

public class App1 {
    public static void main(String[] args) {

        // =======================================
        // Using generic classes: ArrayList example
        // =======================================

        ArrayList<String> names = new ArrayList<>();
        // There can be more than one type argument e.g., in case of HashMap.
        // HashMap<Integer, String> map=new HashMap<>();

        names.add("John");
        names.add("Randy");
        names.add("Brock");
        // names.add(34); // This throws error

        String theName = names.get(0); // Return type is determined using the parameter passed to the class
        System.out.println(theName);
        showNames(names);

        // Arraylist of parent class
        ArrayList<Machine> machines = new ArrayList<>();
        machines.add(new Machine());
        machines.add(new Machine());
        machines.add(new Camera()); // No error
        showMachines(machines);

        // Arraylist of child class
        ArrayList<Camera> cameras = new ArrayList<>();
        cameras.add(new Camera());
        cameras.add(new Camera());
        // cameras.add(new Machine()); // Error
        // showMachines(cameras); // error
        // Parameterized class of parent class is not the parent of parameterized class
        // of child class. Therefore, polymorphism won't work here.

        // Instead we can use a function which uses wildcard(?)
        showList(machines);
        showList(cameras);

        System.out.println("=> SHOW LIST 2");
        showList2(machines);
        showList2(cameras);

        System.out.println("=> SHOW LIST 3");
        showList3(machines);
        showList3(cameras);

    }

    // Method accepting arraylist of type String
    static void showNames(ArrayList<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }

    // Method accepting arraylist of type Machine
    static void showMachines(ArrayList<Machine> list) {
        for (Machine item : list) {
            System.out.println(item);
        }
    }

    // Method accepting arraylist of any type
    static void showList(ArrayList<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    // Method accepting arraylist of type Machine and its all child classes
    static void showList2(ArrayList<? extends Machine> list) {
        for (Machine item : list) {
            item.start();
        }
    }

    // Method accepting arraylist of type Camera and its all parent classes
    static void showList3(ArrayList<? super Camera> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

}

// https://www.programiz.com/java-programming/generics