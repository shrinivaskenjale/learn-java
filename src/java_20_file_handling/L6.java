package java_20_file_handling;

import java.io.FileWriter;
import java.io.PrintWriter;

public class L6 {
    public static void main(String[] args) {

        try (PrintWriter pw = new PrintWriter(new FileWriter("output.txt", true));) {
            pw.println("lsjdfls");
            pw.print("lsjdflj");
            pw.printf("lsjdflsjf");
            pw.write("lksjdfl");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
