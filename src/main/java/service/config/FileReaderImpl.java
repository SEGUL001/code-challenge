package service.config;

import model.FileRecord;
import util.config.FileReader;
import util.config.PropertiesPlugin;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReaderImpl implements FileReader {
    private String key;
    private PropertiesPlugin propertiesPlugin;
    public FileReaderImpl(PropertiesPlugin propertiesPlugin, String key) {
        this.propertiesPlugin = propertiesPlugin;
        this.key = key;
    }

    public List<FileRecord> readPlayersFile() throws Exception{
        File file =  new File(propertiesPlugin.getProperty(key));
        Scanner inputStream = new Scanner(file);
        String[] rawRecord;
        List<FileRecord> fileRecords = new ArrayList<>();

        while (inputStream.hasNextLine()) {
            String data = inputStream.nextLine();
            rawRecord = data.split("\\s+");
            fileRecords.add(new FileRecord(rawRecord[0], rawRecord[1]));
        }
        return fileRecords;
    }
}
