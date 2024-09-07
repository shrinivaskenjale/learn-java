package java_20_file_handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;

public class L5 {

    public static void main(String[] args) {
        char[] array = new char[100];
        try {
            InputStreamReader reader1 = new InputStreamReader(new FileInputStream("./text.txt"),
                    Charset.forName("UTF-8"));

            FileReader reader2 = new FileReader("text.txt", Charset.forName("UTF-8"));

            BufferedReader reader3 = new BufferedReader(new FileReader("text.txt"));

            reader1.read(array);
            System.out.println(String.valueOf(array));

            reader2.read(array);
            System.out.println(String.valueOf(array));

            reader3.read(array);
            System.out.println(String.valueOf(array));
            System.out.println(reader3.readLine());

            // read() single char

            reader1.close();
            reader2.close();
            reader3.close();

            // =================================

            OutputStreamWriter writer1 = new OutputStreamWriter(new FileOutputStream("output.txt"),
                    Charset.forName("UTF-8"));

            FileWriter writer2 = new FileWriter("output2.txt", Charset.forName("UTF-8"));

            BufferedWriter writer3 = new BufferedWriter(new FileWriter("output3.txt"));
            // write() single char

            // PrintWriter writer4 = new PrintWriter(new File("output4.txt"));
            // PrintWriter writer4 = new PrintWriter(new FileWriter("output4.txt"));
            PrintWriter writer4 = new PrintWriter("output4.txt");

            writer1.write("Tech\n");
            writer1.write(array);
            writer1.append("\nMahindra");

            writer2.write("Tech\n");
            writer2.write(array);
            writer2.append("\nMahindra");

            writer3.write("Tech\n");
            writer3.write(array);
            writer3.newLine();
            writer3.append("Mahindra");

            writer4.println("Shrinivas Kenjale");
            writer4.println("Hello!");
            writer4.printf("%s programming language", "Python");
            writer4.append("Hi");

            writer1.close();
            writer2.close();
            writer3.close();
            writer4.close();

        } catch (Exception e) {
            System.out.println("File not found");
        }
    }

}
