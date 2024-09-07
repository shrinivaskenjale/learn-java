package java_03_control_flow;

public class L02_TernaryOperator {
    public static void main(String[] args) {
        double marks = 87;

        String result = (marks > 40) ? "pass" : "fail";

        System.out.println("Result is: " + result);
    }
}

/*
 * 
 * Syntax: condition ? expression1 : expression2;
 * If condition is true, expression1 is executed and returned.
 * If condition is false, expression2 is executed and returned.
 * 
 * The ternary operator takes 3 operands (condition, expression1, and
 * expression2). Hence, the name ternary operator.
 */