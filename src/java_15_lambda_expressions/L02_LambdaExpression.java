package java_15_lambda_expressions;

@FunctionalInterface
interface FI1 {
    // abstract method
    double getPiValue();
}

@FunctionalInterface
interface FI2 {
    // abstract method with parameters
    int getSum(int a, int b);
}

public class L02_LambdaExpression {
    public static void main(String[] args) {

        // Lambda expression with expression body
        FI1 ref1 = () -> 3.14;

        // Lambda expression with block body
        FI1 ref2 = () -> {
            double pi = 3.14;
            return pi;
        };

        System.out.println("Value of Pi = " + ref1.getPiValue());
        System.out.println("Value of Pi = " + ref2.getPiValue());

        FI2 ref3 = (x, y) -> x + y;

        System.out.println("Sum of 5 & 3 = " + ref3.getSum(5, 3));

    }
}

/*
 * ===================
 * Lambda expression
 * ===================
 * 
 * The lambda expression was introduced first time in Java 8. Its main
 * objective is to increase the expressive power of the language.
 * 
 * Lambda expression is, essentially, an anonymous or unnamed method. The lambda
 * expression does not execute on its own. Instead, it is used to implement a
 * method defined by a functional interface.
 * 
 * Before lambda expressions, functional interfaces were implemented using
 * anonymous classes.
 * 
 * Methods in stream api use lambda expressions as arguments.
 * 
 * ============================
 * Defining lambda expression
 * ============================
 * 
 * Syntax to define lambda expression:
 * (parameter list) -> lambda body
 * 
 * The new operator (->) used is known as an arrow operator or a lambda
 * operator.
 * 
 * The lambda body can be:
 * a. Expression body - Single expression which is also the return value of the
 * method.
 * b. Block body - Block of statements like normal method.
 * 
 * Lambda expression's signature should match the signature of the abstract
 * method of FI.
 * 
 * Defining data type of parameters is optional in LE.
 * (int a) -> a + 2 is same as (a) -> a + 2
 * In case of ambiguity, you need to write types of parameters.
 * 
 * Type of the lambda expression is always a functional interface.
 * a. We can assign LE to variable of type FI.
 * b. We can pass LE as a argument to parameter of type FI.
 * 
 * If lamda expression has single parameter without data type, we can omit
 * parenthesis.
 * age -> age > 18
 * 
 * ====================
 * Simple explanation
 * ====================
 * 
 * A lambda expression returns an instance of a class that implements the
 * functional interface it targets.
 * 
 * The lambda expression itself is a implementation of the abstract method in
 * the functional interface.
 * 
 * When you use lambda expression, the java compiler generates an instance of an
 * anonymous class that implements the functional interface, providing the
 * implementation of its single abstract method.
 * 
 * 
 * ==============
 * Extra
 * ==============
 * 
 * We can access and modify instance, static variables of class in which lambda
 * expression and anonymous class are.
 * 
 * We can only access and not modify local variables of function in which lambda
 * expression of anonymous class are present.
 * 
 * Names of parameters in LE can be different than abstract method.
 * 
 */
