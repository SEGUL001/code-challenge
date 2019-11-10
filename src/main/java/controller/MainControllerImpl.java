package controller;

import model.Player;
import model.ScoreBoard;
import util.MainController;
import util.PlayerService;
import util.ScoreBoardService;
import util.config.FileReader;

import java.util.List;

public class MainControllerImpl implements MainController {

   private PlayerService playerService;
   private FileReader fileReader;
   private ScoreBoardService scoreBoardService;

   public MainControllerImpl(PlayerService playerService, FileReader fileReader, ScoreBoardService scoreBoardService) {
      this.playerService = playerService;
      this.fileReader = fileReader;
      this.scoreBoardService = scoreBoardService;
   }

   public void showScoreBoard(){
      try{
          List fileRecordList = fileReader.readPlayersFile();

         List<Player> playerList = playerService.getPlayers(fileRecordList);
         ScoreBoard scoreBoard = scoreBoardService.getScoreBoard(fileRecordList, playerList);
         scoreBoardService.drawScoreBoard(scoreBoard);

      } catch (Exception e){
         e.printStackTrace();
      }
   }
}
