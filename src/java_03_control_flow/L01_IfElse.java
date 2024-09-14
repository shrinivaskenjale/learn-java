package java_03_control_flow;

public class L01_IfElse {
    public static void main(String[] args) {
        String username = "shrinivas";
        String password = "1234";

        if (password.equals("1234")) {
            System.out.println("Welcome " + username);
        } else {
            System.out.println("Not authenticated");
        }
    }
}

/*
 * Logical operators used to create complex conditions.
 * 
 * && - logical and
 * || - logical or
 * ! - logical not
 * 
 */