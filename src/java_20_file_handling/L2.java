package java_20_file_handling;

import java.io.*;

public class L2 {
    public static void main(String[] args) {

        File file = new File("src\\java_20_file_handling\\myfile.txt");

        BufferedReader bufferedReader = null;

        try {
            FileReader fileReader = new FileReader(file); // May throw FileNotFoundException
            bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Can't find the file: " + file.getName());
        } catch (IOException e) {
            System.out.println("Problem reading from the file: " + file.getName());
        } finally {
            if (bufferedReader != null)
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    System.out.println("Unable to close file: " + file.getName());
                }
        }
    }
}

/*
 * FileReader() constructor may throw FileNotFoundException in case file does
 * not exist.
 * The readLine() method of BufferedReader object may throw IOException in case
 * there was problem while reading from or writing to file.
 * 
 * FileNotFoundException is subclass of IOException.
 * 
 * readLine() returns next line as a string. Once all lines are read, it returns
 * null.
 * 
 * Calling close() on BufferedReader object may throw IOException.
 * 
 * We generally close resources in finally block.
 * 
 * We don't need to close FileReader object manually because closing a
 * BufferedReader will also close the underlying FileReader. This is because
 * close() method of BufferedReader closes the stream and any resource it wraps.
 */