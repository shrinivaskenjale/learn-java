package java_22_multithreading;

public class L4 {
    public static void main(String[] args) {
        Sequence sequence = new Sequence();

        Worker worker1 = new Worker(sequence);
        worker1.start();

        Worker worker2 = new Worker(sequence);
        worker2.start();
    }
}

class Sequence {
    private int value = 0;

    // option 2: Synchronized method
    public synchronized int getNext() {
        // Imagine thread 1 reads value and before assigning new value to the variable,
        // control is given to thread 2. Thread 2 might successfully assign the new
        // value. But when control comes back to thread 1 it still has old data which
        // gets assigned to the variable. Therefore we see few same values in both
        // threads.
        // value = value + 1;
        // return value;

        // To solve this issue we want atomicity - Either this line executes completely
        // within a thread or this line is not executed at all before control is given
        // to other thread.
        // We use synchronized keyword to achieve it.

        // option 1: Synchronized block
        // synchronized (this) {
        // value = value + 1;
        // return value;
        // }

        value = value + 1;
        return value;
    }
}

class Worker extends Thread {
    Sequence sequence;

    public Worker(Sequence sequence) {
        this.sequence = sequence;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " ==> " + sequence.getNext());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/*
 * 
 * https://www.baeldung.com/java-synchronized
 * 
 * If 2 or more threads are accessing same data, things can get problematic.
 * So, we need synchronization when 2 or more threads share same data.
 * 
 * What is thread safety?
 * 
 * One processor can control only one thread at a given point in time.
 * In multi-threaded program, processor switches between these threads.
 * This may cause data inconsistency. Because for particular thread,
 * mid-execution it may be asked to pause the execution by the processor and
 * control might be given to other thread.
 * First thread might have read some data before its control was taken by
 * processor. The same data might be changed by the other thread. So when
 * control comes back to first thread, it has old out-dated copy of data read.
 * 
 * When code in synchronized block or synchronized method is executing, control
 * is not given to another thread until execution is complete.
 */