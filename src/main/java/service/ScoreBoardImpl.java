package service;

import util.PlayerHandler;
import util.ScoreBoard;

import java.io.IOException;
import java.util.List;

public class ScoreBoardImpl implements ScoreBoard {

    private PlayerHandler playerHandler;

    public ScoreBoardImpl(PlayerHandler playerHandler) {
        this.playerHandler = playerHandler;
    }

    public void DrawScoreBoard(){

        try{
            List playerList = playerHandler.getPlayerList();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
