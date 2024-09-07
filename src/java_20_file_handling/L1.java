package java_20_file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class L1 {
    public static void main(String[] args) {

        try {
            File file = new File("src/java_20_file_handling/myfile.txt");
            Scanner input = new Scanner(file); // May throw FileNotFoundException
            // Scanner sc = new Scanner(new FileReader(path)); // also works
            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}

/*
 * System.out => public final static PrintStream out;
 * System.in => public final static InputStream in;
 * 
 * Scanner constructor accepts parameter of type InputStream.
 * Scanner sc = new Scanner(System.in); => sc object can read data from
 * keyboard.
 * 
 * Scanner can be used to read data from files too.
 * Pass the File object to Scanner constructor.
 * Constructor may throw FileNotFoundException if file does not exist. So either
 * add throws declaration or add try-catch.
 * 
 * Path to file can be absolute or relative to path where program was run.
 * 
 * https://www.geeksforgeeks.org/file-class-in-java/
 * 
 * Using Scanner to read files is newer way compared using BufferedReader and
 * FileReader.
 * 
 * File object is a platform independent way of representing file/folder on a
 * computer.
 */