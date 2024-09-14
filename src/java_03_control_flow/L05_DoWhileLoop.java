package java_03_control_flow;

import java.util.Scanner;

public class L05_DoWhileLoop {
    public static void main(String[] args) {

        // ===============
        // Example 1
        // ===============

        int i = 1;

        // Do while loop runs at least once
        do {
            // Variable declared in the block is not accessible in the condition expression.
            // int i = 1;

            System.out.println(i);
            i += 1;

        } while (i <= 10);

        // ===============
        // Example 2
        // ===============

        // The do-while loop is useful for taking user input until user enters specific
        // input value to stop the loop.
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter integer 7 to stop: ");
            choice = sc.nextInt();
        } while (choice != 7);
        sc.close();
    }
}
