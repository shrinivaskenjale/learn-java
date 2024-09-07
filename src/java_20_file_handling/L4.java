package java_20_file_handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class L4 {
    public static void main(String[] args) {

        File file = new File("src\\java_20_file_handling\\write.txt");

        try (BufferedWriter br = new BufferedWriter(new FileWriter(file));) {
            br.write("Shrinivas Kenjale");
            br.newLine();
            br.write("Hello World");
        } catch (IOException e) {

        }
    }
}

// Direct path can be passed to FileWriter constructor as string.

// BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt", true));