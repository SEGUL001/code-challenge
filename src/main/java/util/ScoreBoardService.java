package util;

import model.FileRecord;
import model.Player;
import model.ScoreBoard;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public interface ScoreBoardService {
    void drawScoreBoard(ScoreBoard scoreBoard);
    ScoreBoard getScoreBoard(List<FileRecord> fileRecords, List<Player> playerList) throws IOException;
}
