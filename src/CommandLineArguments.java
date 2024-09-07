public class CommandLineArguments {
    public static void main(String[] args) {
        System.out.println("Command-Line arguments are");

        // loop through all arguments
        for (String str : args) {
            System.out.println(str);
        }
    }
}

/*
 * ========================
 * Command-Line Arguments
 * ========================
 * 
 * The command-line arguments in Java allow us to pass arguments during the
 * execution of the program.
 * 
 * As the name suggests arguments are passed through the command line.
 * 
 * If we want to pass some arguments while running the program, we can pass the
 * arguments after the class name in java command.
 * => java Main apple ball cat
 * 
 * Here apple, ball, and cat are arguments passed to the program through the
 * command line.
 * 
 * The main() method includes an array of string named args as its parameter.
 * => public static void main(String[] args) {...}
 * 
 * The String array stores all the arguments passed through the command line.
 * 
 * Note: Arguments are always stored as strings and always separated by
 * white-space.
 * 
 * The main() method of every Java program only accepts string arguments. Hence
 * it is not possible to pass numeric arguments through the command line.
 * However, we can later convert string arguments into numeric values.
 */
