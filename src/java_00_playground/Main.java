package java_00_playground;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void readConfig() throws IOException {
        File file = new File("src/application.properties");
        FileReader fr = new FileReader(file);
        Properties properties = new Properties();
        properties.load(fr);

        System.out.println(properties.getProperty("USERNAME"));
        System.out.println(properties.getProperty("PASSWORD"));
        System.out.println(properties.getProperty("NULL"));

    }

    public static void main(String[] args) throws IOException {
        readConfig();
    }
}

/*
 * Data that can change is put into property file. So that when we want to
 * change the data, we don't have to update the code at multiple places.
 * It is also called config file.
 * 
 * Extension should be .properties
 * # This is comment in properties file.
 * PROPERTY=VALUE
 * Values are always strings, don't put quotes around values.
 * Don't put space around =
 * 
 */