package service.config;

import util.config.PropertiesPlugin;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesPluginImpl implements PropertiesPlugin {
    String file = "";

    InputStream inputStream;
    public String getProperty(String key) throws IOException{

            Properties prop = new Properties();
            String propFileName = "config.properties";

            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
            try{
                prop.load(inputStream);
                file = prop.getProperty(key);
                inputStream.close();
            } catch (IOException e){
                throw e;
            }
            return file;
    }
}


