package service;

import model.Play;
import model.Player;
import util.PlayService;
import util.config.FileReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayServiceImpl implements PlayService {
    private FileReader fileReader;

    public PlayServiceImpl(FileReader fileReader) {
        this.fileReader = fileReader;
    }



    public void getPlayList(Scanner inputStream, List<Player> playerList) throws IOException{
        List<Play> playList = new ArrayList<Play>();
        Play play = new Play();
        String[] rawPlay;

        while (inputStream.hasNextLine()) {
                String data = inputStream.nextLine();
                rawPlay = data.split("\\s+");
                for (Player player : playerList){
                    if (rawPlay[0].equals(player.getName())){
                        player.getPlayList().add(new Play(player, Integer.parseInt(rawPlay[1])));
                    }
                }
        }
    }
}
