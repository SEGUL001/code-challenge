package util.config;

import java.io.IOException;

public interface PropertiesPlugin {

    String getProperty(String key) throws IOException;
}
