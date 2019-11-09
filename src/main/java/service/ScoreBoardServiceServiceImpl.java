package service;

import model.FileRecord;
import model.Play;
import model.Player;
import model.ScoreBoard;
import util.ScoreBoardService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScoreBoardServiceServiceImpl implements ScoreBoardService {

    public void drawScoreBoard(ScoreBoard scoreBoard){
    }

    public ScoreBoard getScoreBoard(List<FileRecord> fileRecords, List<Player> playerList) throws IOException {
        for (FileRecord fileRecord : fileRecords){
            for (Player player : playerList){
                if (fileRecord.getName().equals(player.getName())){
                    player.getPlayList().add(new Play(player, fileRecord.getScore()));
                }
            }
        }
        return new ScoreBoard(playerList);
    }
}
