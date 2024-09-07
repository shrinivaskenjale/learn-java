package java_03_control_flow;

public class L05_DoWhileLoop {
    public static void main(String[] args) {
        int i = 1;

        // Do while loop runs at least once
        do {
            // Variable declared in the block is not accessible in the condition expression.
            // int i = 1;

            System.out.println(i);
            i += 1;

        } while (i <= 10);
    }
}

/*
 * do-while loop is useful for taking user input until user enters valid input
 * value
 */
