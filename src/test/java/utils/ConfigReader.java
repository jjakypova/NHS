package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader { //professional concept. It is favorite for ahmet!
    public static String readProperty(String key) {
        File file = new File("configuration.properties");
        Properties properties = new Properties();

        try {
            properties.load(new FileInputStream(file));//This properties object will read the Properties File.

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return properties.getProperty(key);

    }
}
