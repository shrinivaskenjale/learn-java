package java_05_classes_and_objects;

public class L00_BTS {
    public static void main(String[] args) {

    }

}

// Heap & stack
// https://tm.udemy.com/course/master-practical-java-development/learn/lecture/7755262

/*
 * main() method is the starting point of java application.
 * 
 * The main memory is allocated to java program to run is divided in 2 parts:
 * a. stack
 * b. heap
 * 
 * When method is called, a frame is pushed on the stack corresponding to that
 * method. And when method is finished running and returns, the frame is popped
 * from the stack.
 * 
 * Local variables are created in frame of the method in the stack.
 * Local primitive variables store value directly.
 * Local reference variables store the memory address or reference of the object
 * which gets created in the heap memory.
 * 
 * Objects of reference typse are created in heap memory.
 * 
 * Garbage collection: When there is no any variable pointing to the object in
 * the heap memory, that object becomes the candidate for being deleted.
 * Garbage collection is the process which deletes objects in the heap memory
 * which have no variables pointing to them.
 * Use of GC is to release the memory held by objects which are no longer used.
 * 
 * 
 * Instance variables are created within the heap memory allocated to object.
 * Primitive instance variables store the value directly.
 * Reference instance variables store the memory address or the reference of the
 * object which gets created in the heap memory.
 * 
 * Static variables are also stored in the heap memory.
 */