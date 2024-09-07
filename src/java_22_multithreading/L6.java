package java_22_multithreading;

import java.util.*;

public class L6 {
    public static void main(String[] args) {

    }
}

class Producer implements Runnable {
    List<Integer> questionList;
    final int LIMIT = 5;
    // private int questionNo;

    public Producer(List<Integer> questionList) {
        this.questionList = questionList;
    }

    public void readQuestion(int questionNo) {
        if (questionList.size() == LIMIT) {
            System.out.println("Questions have reached the limit...wait for answers");
        }
    }

    public void run() {
    }
}

class Consumer implements Runnable {
    public void run() {
    }

}

/*
 * Producer Consumer Pattern Using wait() and notify()
 * This pattern is used everywhere in multithreading.
 * 
 * In this example, questionList is shared resource.
 * Producer is adding question to list and consumer is removing them from list.
 */
