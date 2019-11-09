package service.config;

import util.config.FileReader;
import util.config.PropertiesPlugin;

import java.io.File;

public class FileReaderImpl implements FileReader {

    private PropertiesPlugin propertiesPlugin;

    public FileReaderImpl(PropertiesPlugin propertiesPlugin) {
        this.propertiesPlugin = propertiesPlugin;
    }

    public File readPlayersFile(){
        try{
            return new File(propertiesPlugin.getProperty("file"));
        } catch (Exception e){
            System.out.println("Error while getting the prop");
            return null;
        }
    }
}
