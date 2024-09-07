package Theory;

public class Memory {

}

/*
 * In Java, memory management is handled by the Java Virtual Machine (JVM),
 * which divides memory into different regions, primarily the stack and the
 * heap.
 * 
 * ===============
 * Stack Memory
 * ===============
 * 
 * Purpose: The stack memory is used for the execution of threads, storing
 * method call frames, local variables, and intermediate computations.
 * 
 * Characteristics:
 * 1. Memory is allocated and deallocated in a Last-In-First-Out (LIFO) manner.
 * 2. Each thread has its own stack.
 * 3. It is generally faster to access than heap memory.
 * 4. Size is limited and typically smaller than the heap.
 * 
 * ==============
 * Heap Memory
 * ==============
 * 
 * Purpose: The heap memory is used for dynamic memory allocation, where objects
 * and arrays are created and stored.
 * 
 * Characteristics:
 * 1. Shared among all threads.
 * 2. Memory is managed by the garbage collector, which reclaims memory used by
 * objects that are no longer reachable.
 * 3. Generally larger in size compared to stack memory.
 * 4. Objects in the heap can have a longer lifetime, as they exist until they
 * are no longer referenced and are collected by the garbage collector.
 * 
 * =====================
 * Reference Variables
 * =====================
 * 
 * Definition: Reference variables are variables that hold references
 * (addresses) to objects in the heap. They do not store the actual object data
 * themselves but a pointer to the object in the heap memory.
 * 
 * Storage: Reference variables themselves are stored in the stack, while the
 * objects they point to are stored in the heap.
 * 
 * => String str = new String("Hello");
 * Here, str is a reference variable stored in the stack, pointing to a String
 * object stored in the heap.
 * 
 * =================
 * Primitive Types
 * =================
 * 
 * Definition: Primitive types in Java are basic data types like int, float,
 * char, boolean, etc. They store actual values rather than references to
 * objects.
 * 
 * Storage:
 * 1. Local primitive variables are stored directly in the stack.
 * 2. Instance variables (primitives that are fields of objects) and static
 * variables are stored in the heap as part of their respective objects or
 * classes.
 * 
 * => int x = 10;
 * Here, x is a primitive variable stored directly in the stack with a value of
 * 10.
 * 
 */