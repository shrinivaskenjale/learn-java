package java_02_input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L03_BufferedReaderInput {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String text = br.readLine();
        System.out.println(text);

        int number = Integer.parseInt(br.readLine());
        System.out.println(number);
    }
}

/*
 * Unlike Scanner, the BufferedReader can't parse the values on its own.
 * Method readLine() returns string.
 * We need to parse it to required data types.
 */
