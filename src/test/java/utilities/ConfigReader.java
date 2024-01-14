package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties properties;
    static {
        String file_path="configuration.properties";
        try{
            FileInputStream fileInputStream = new FileInputStream(file_path);
            properties =new Properties();
            properties.load(fileInputStream);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String getPropertie(String key){
        return properties.getProperty(key);
    }
}
