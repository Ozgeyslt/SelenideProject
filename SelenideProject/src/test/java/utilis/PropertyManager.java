package utilis;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyManager {

    static Properties property;

    public PropertyManager() {
        Properties props=new Properties();
        try{
            props.load(new FileReader(new File(ClassLoader.getSystemResource("config.properties").getPath())));
            property=props;
        } catch (IOException e){
            System.out.println("properties file not found");
        }
    }

    public static String getProperty(String key){
        Properties props=property;
        if (props !=null){
            return props.getProperty(key);
        }
        return null;
    }
}
