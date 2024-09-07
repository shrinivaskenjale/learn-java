package java_15_lambda_expressions;

public class L5 {
    public static void main(String[] args) {
        String name = "Shri"; // Effectively final
        // name = "Ram"; // Won't work - No more effectively final

        // final String name = "John"; // Final

        Runner runner = new Runner();
        runner.run(new Executable() {
            public void execute() {
                System.out.println("Hello World");
                System.out.println(name); // final or effectively final local var
            }
        });

        runner.run(() -> {
            System.out.println("Hello World!");
            System.out.println(name); // final or effectively final local var
        });

        // Polymorphism
        Executable ex1 = () -> System.out.println("Hi there");
        Object ex2 = (Executable) () -> System.out.println("Hi there");

        ex1.execute();
        // ex2.execute(); // execute() is not accessible on Object
        ((Executable) ex2).execute();

    }
}

interface Executable {
    void execute();
}

class Runner {

    public void run(Executable executable) {
        System.out.println("Executing code block...");
        executable.execute();
    }
}

/*
 * Suppose we want to pass some block of code to run() method of Runner class.
 * Before LE, we needed to create interface with single abstract method.
 * Use this interface as parameter in the method that needs block of code.
 * When calling this method, we used to pass the implementation of the interface
 * using anonymous class.
 * 
 * Local variable name defined in an enclosing scope must be final or
 * effectively final
 * 
 * Effective Final Variable: a variable which is not explicitly declared with a
 * final keyword but never gets modified throughout the application, although
 * it's not declared as final since the value has not been modified hence
 * compiler treats them just like final and can be termed as Effective Final.
 */