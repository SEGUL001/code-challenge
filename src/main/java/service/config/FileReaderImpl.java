package service.config;

import util.config.FileReader;
import util.config.PropertiesPlugin;

import java.io.File;
import java.io.IOException;

public class FileReaderImpl implements FileReader {

    private PropertiesPlugin propertiesPlugin;

    public FileReaderImpl(PropertiesPlugin propertiesPlugin) {
        this.propertiesPlugin = propertiesPlugin;
    }

    public File readPlayersFile() throws IOException {
            return new File(propertiesPlugin.getProperty("file"));
    }
}
