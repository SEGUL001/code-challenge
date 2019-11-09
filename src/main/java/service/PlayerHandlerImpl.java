package service;

import model.Player;
import service.config.FileReaderImpl;
import util.PlayerHandler;
import util.config.FileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayerHandlerImpl implements PlayerHandler {
    private FileReader fileReader;

    public PlayerHandlerImpl(FileReader fileReader) {
        this.fileReader = fileReader;
    }



    public List getPlayerList(){
        try {
            List<Player> playerList = new ArrayList<Player>();
            String[] values = null;
            Scanner inputStream = new Scanner(this.fileReader.readPlayersFile());
            while (inputStream.hasNextLine()) {
                    String data = inputStream.nextLine();
                    values = data.split("\\t");
                    if (values[1] != null) {
                        Player player = new Player(values[0].toString(), Integer.getInteger(values[1]));
                    }
            }
            return new ArrayList();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }

        }

}
