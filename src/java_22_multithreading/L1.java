package java_22_multithreading;

public class L1 {
    public static void main(String[] args) {
        System.out.println("Hello World 1");

        // Print this thread's name.
        System.out.println(Thread.currentThread().getName()); // "main"

        // Create instance of Task which is a Thread.
        Task task = new Task(); // Still single threaded program

        System.out.println("Starting thread 1");
        // Call start() to execute run() method on separate thread.
        task.start(); // Now it's multithreaded

        System.out.println(task.getName()); // Get the name of thread
        task.setName("First Thread"); // Set the name of thread
        System.out.println(task.getName());

        // Code after start() continues to run without waiting for it to return.

        // It takes time to create new thread and hence we see "Hello World 2" even
        // before "Number: 0".
        System.out.println("Hello World 2");

        // We can't call start() more than once on same instance of the thread.
        // task.start(); // Error

        System.out.println("Starting thread 2");
        Task task2 = new Task();
        task2.start();

    }

}

class Task extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Number: " + i + " - " + Thread.currentThread().getName());

            try {
                // Sleep the thread for given milliseconds
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

/*
 * In a modern computers we run multiple independent processes simultaneously.
 * Ex. Using browser while playing music on music player with antivirus software
 * running in background.
 * 
 * Within a process threre are multiple lightweight child processes running
 * simultaneously.
 * Ex. Within browser application, multiple tabs could be open doing different
 * tasks.
 * These child processes are called threads.
 * 
 * So far, we have been writing single threaded java program. This single thread
 * is called main thread.
 * In single threaded program, only 1 line of code can be executed at any given
 * point in time. But, in multithreaded program, more than 1 lines of code can
 * be run at any given point in time.
 * 
 * When we run java program, main() method starts executing on main thread.
 * 
 * 
 * Thread class is present since java 1.
 * Thread class implements Runnable interface.
 * Runnable interface has single abstract method run().
 * Both Thread and Runnable belong to java.lang package.
 * The code that we run in the run() method is run on the separate thread.
 * 
 * 
 * ==============
 * start()
 * ==============
 * 
 * The start() method of thread causes this thread to begin execution; the Java
 * Virtual Machine calls the run() method of this thread.
 * 
 * We can't call start() more than once on same instance of the thread.
 * So if you want to perform the task more than once, create multiple instances
 * of a thread and the call start() on each instance.
 *
 * 
 * The main thread can die even if other threads are running. Then main() method
 * completes, the main thread terminates. However, the JVM keeps running as long
 * as there are any non-daemon (user created) threads still alive.
 * 
 * Thread.currentThread().getName() returns the name of the thread.
 * Main thread returns "main".
 * User created threads return "Thread-<n>" where n>=0
 * 
 * We can rename the thread using setName() method.
 * 
 * 
 */