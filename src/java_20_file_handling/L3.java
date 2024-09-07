package java_20_file_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class L3 {
    public static void main(String[] args) {
        File file = new File("src\\java_20_file_handling\\myfile.txt");

        // You must both declare and intitialize FileReader and BufferedReader inside
        // brackets of try only.
        try (FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Can't find the file: " + file.getName());
        } catch (IOException e) {
            System.out.println("Problem reading from the file: " + file.getName());
        }

        try (Connection conn = new Connection();) {
            conn.download();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class Connection implements AutoCloseable {
    public void download() {
        System.out.println("Downloading resources");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing the connection");
    }

}

/*
 * We don't need to close the resources declared using try-with-resources syntax
 * within brackets.
 * 
 * Any class that implements AutoCloseable interface can be used within brackets
 * of try-with-resources.
 * AutoCloseable has single abstract method close().
 * The close() method of an AutoCloseable object is called automatically when
 * exiting a try-with-resources block for which the object has been declared in
 * the resource specification header.
 */
