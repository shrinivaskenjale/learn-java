package java_03_control_flow;

import java.util.Scanner;

public class L06_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice:");
        System.out.println("1. Samsung");
        System.out.println("2. Xiaomi");
        System.out.println("3. Apple");
        System.out.println("4. Oppo");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You chose Samsung");
                break;
            // If you don't use break, next case's code executes.

            case 2:
                System.out.println("You chose Xiaomi");
                break;

            case 3:
                System.out.println("You chose Apple");
                break;

            case 4:
                System.out.println("You chose Oppo");
                break;

            // default is optional
            // If there is no match, the code of the default case is executed
            default:
                System.out.println("Invalid choice");
        }

        sc.close();

    }
}

/*
 * 
 * The working of the switch-case statement is similar to the Java
 * if...else ladder.
 * 
 * ==============================================
 * Important Rules for Switch Statements in Java
 * ==============================================
 * 
 * 1. The Java switch statement only works with:
 * a. Primitive data types: byte, short, int, char
 * b. Enumerated types
 * c. String Class
 * d. Wrapper Classes: Byte, Short, Integer, Character
 * 
 * 2. It doesn't work with long, float, double, or boolean.
 * 
 * 3. Each case value must be a unique literal or constant expression and can't
 * be a variable.
 * 
 * 4. Duplicate cases are not allowed.
 * 
 * 
 * =======
 * Extra
 * =======
 * 
 * We can use {} to wrap the code in the case for readability.
 */