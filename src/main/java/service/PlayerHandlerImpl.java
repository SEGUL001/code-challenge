package service;

import model.Play;
import util.PlayerHandler;
import util.config.FileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayerHandlerImpl implements PlayerHandler{
    private FileReader fileReader;

    public PlayerHandlerImpl(FileReader fileReader) {
        this.fileReader = fileReader;
    }



    public List getPlayerList() throws IOException{
        List<Play> playList = new ArrayList<Play>();
        Play play = new Play();
        String[] values;

        try {
            File file = this.fileReader.readPlayersFile();
            Scanner inputStream = new Scanner(file);
            while (inputStream.hasNextLine()) {
                    String data = inputStream.nextLine();
                    values = data.split("\\s+");
                    if (values.length > 1) {
                        try{
                            play = new Play(values[0].toString(), Integer.parseInt(values[1]));
                        }
                        catch (NumberFormatException e){
                            play = new Play(values[0].toString(), 0);
                        }
                        finally {
                                playList.add(play);
                        }
                    }
            }
            return playList;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
        catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
        }
}
