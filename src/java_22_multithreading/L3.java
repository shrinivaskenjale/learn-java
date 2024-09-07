package java_22_multithreading;

public class L3 {
    public static void main(String[] args) {
        TaskC task = new TaskC();
        Thread thread1 = new Thread(task);
        thread1.start();

        Thread thread2 = new Thread(task);
        thread2.start();

        // Using anonymous class
        Thread thread3 = new Thread(new Runnable() {

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

        });

        thread3.start();
    }
}

class TaskC implements Runnable {
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
 * You can't implement Runnable interface in a class and call run().
 * Calling run() method is same as calling some method in the same thread.
 * All thread creating logic is handled by Thread class.
 * Runnable is just a functional interface with run() abstract method.
 * 
 * Instead you can create a instance of a class that implements Runnable and
 * then create new thread by creating new instance of Thread and pass instance
 * of Runnable to its constructor.
 */
