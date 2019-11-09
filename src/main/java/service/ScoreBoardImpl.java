package service;

import util.PlayerHandler;
import util.ScoreBoard;

import java.util.List;

public class ScoreBoardImpl implements ScoreBoard {

    private PlayerHandler playerHandler;

    public ScoreBoardImpl(PlayerHandler playerHandler) {
        this.playerHandler = playerHandler;
    }

    public void DrawScoreBoard(){

        List playerList = playerHandler.getPlayerList();




    }

}
