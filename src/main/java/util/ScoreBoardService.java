package util;

import model.Player;

import java.util.List;

public interface ScoreBoardService {
    /* void drawScoreBoard(ScoreBoard scoreBoard);
    ScoreBoard getScoreBoard(List<FileRecord> fileRecords, List<Player> playerList) throws IOException;*/
    void drawScoreBoard(List<Player> playerList);
}
