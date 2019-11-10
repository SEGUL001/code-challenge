package controller;

import service.FrameServiceImpl;
import util.MainController;
import util.PlayerService;
import util.ScoreBoardService;
import util.config.FileReader;

import java.util.List;

public class MainControllerImpl implements MainController {

   private PlayerService playerService;
   private FileReader fileReader;
   private ScoreBoardService scoreBoardService;
   private FrameServiceImpl frameService;
   public MainControllerImpl(PlayerService playerService, FileReader fileReader,
                             ScoreBoardService scoreBoardService, FrameServiceImpl frameService) {
      this.playerService = playerService;
      this.fileReader = fileReader;
      this.scoreBoardService = scoreBoardService;
      this.frameService = frameService;
   }

   public void showScoreBoard(){
      try{
          List fileRecordList = fileReader.readPlayersFile();

         List playerList = playerService.getPlayers(fileRecordList);
         playerList = frameService.buildFrames(playerList, fileRecordList);
         scoreBoardService.drawScoreBoard(playerList);

      } catch (Exception e){
         e.printStackTrace();
      }
   }
}
