package java_20_file_handling;

// Import File class
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        // On windows add one more `\` to escape the special character.
        // String fileName = "C:\\Users\\Shrinivas\\Code\\Course\\Udemy\\Java Tutorial
        // for Complete Beginners\\read-this-file.txt";
        // or replace `\` with `/`

        // using absolute path
        // String fileName = "C:/Users/Shrinivas/Code/Course/Udemy/Java Tutorial for
        // Complete Beginners/read-this-file.txt";

        // using relative path with respect to place where from we run program.
        String fileName = "./read-this-file.txt";

        // create file object
        File textFile = new File(fileName);

        // pass file object to Scanner object
        Scanner input = new Scanner(textFile);

        int value = input.nextInt();
        System.out.println("value: " + value);

        // nextInt() just reads a number and not a newline character. When we call
        // nextLine() that character is read and thus we see blank line.
        // To avoid this, we take nextLine() input and discard it.
        input.nextLine();

        // Looping over file line by line
        while (input.hasNextLine()) {
            String line = input.nextLine();
            System.out.println(line);
        }

        input.close();

    }

}
