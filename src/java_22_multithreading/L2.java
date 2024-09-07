package java_22_multithreading;

public class L2 {
    public static void main(String[] args) {
        Task2 task1 = new Task2("Thread A");
        Task2 task2 = new Task2("Thread B");

        task1.start();
        task2.start();
    }
}

class Task2 extends Thread {
    String name;

    public Task2(String name) {
        this.name = name;
    }

    public void run() {
        Thread.currentThread().setName(name);

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