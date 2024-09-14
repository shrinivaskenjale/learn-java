package java_03_control_flow;

public class L03_ForLoop {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i += 1) {
            // Scope of initialization variable is loop itself.
            System.out.println("Hello " + i);
        }

        // Infinite loop
        // byte num = 1;
        // for (;;) {
        // System.out.println(num);
        // num += 1;
        // }

        /*
         * You can add multiple initializations and update statements separated by
         * comma. But you can have at most one test condition statement.
         * We can't initialize the different data types in the for loop.
         */
        for (int i = 0, j = 0; i < 5 && j < 5; i++, j = j + 1) {
            System.out.println(i + " " + j);

        }
        // initialization => condition => body => updation => condition => body => ...
    }
}

/*
 * 
 * break: keyword takes you out of current loop
 * 
 * continue: keyword stops current iteration of loop and continue with next
 */
