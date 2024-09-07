package java_15_lambda_expressions;

public class L01_FunctionalInterface {

}

@FunctionalInterface
interface MyFunctionalInterface {
    // The single abstract method
    double getValue();
}

/*
 * 
 * ======================
 * Functional Interface
 * ======================
 * 
 * If a Java interface contains one and only one abstract method then it is
 * termed as functional interface. This only one method specifies the intended
 * purpose of the interface.
 * 
 * It can have any number of non-abstract methods.
 * 
 * For example, the Runnable interface from package java.lang; is a functional
 * interface because it constitutes only one method i.e. run().
 * 
 * @FunctionalInterface annotation forces the Java compiler to indicate that the
 * interface is a functional interface. Hence, does not allow to have more than
 * one abstract method. However, it is not compulsory though.
 * 
 * 
 */
