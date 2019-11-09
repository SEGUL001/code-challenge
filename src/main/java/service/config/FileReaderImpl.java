package service.config;

import model.FileRecord;
import util.config.FileReader;
import util.config.PropertiesPlugin;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReaderImpl implements FileReader {

    private PropertiesPlugin propertiesPlugin;

    public FileReaderImpl(PropertiesPlugin propertiesPlugin) {
        this.propertiesPlugin = propertiesPlugin;
    }

    public List<FileRecord> readPlayersFile() throws Exception{
        File file =  new File(propertiesPlugin.getProperty("file"));
        Scanner inputStream = new Scanner(file);
        String[] rawRecord;
        List<FileRecord> fileRecords = new ArrayList<>();

        while (inputStream.hasNextLine()) {
            String data = inputStream.nextLine();
            rawRecord = data.split("\\s+");
            try{
                fileRecords.add(new FileRecord(rawRecord[0], Integer.parseInt(rawRecord[1])));
            }
            catch (NumberFormatException e){
                fileRecords.add(new FileRecord(rawRecord[0], 0));
            }
        }
        return fileRecords;
    }
}
