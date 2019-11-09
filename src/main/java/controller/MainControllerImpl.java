package controller;

import util.MainController;
import util.PlayerHandler;

import java.io.IOException;

public class MainControllerImpl implements MainController {


   private PlayerHandler playerHandler;


   public MainControllerImpl( PlayerHandler playerHandler) {
      this.playerHandler = playerHandler;
   }

   public void getScoreBoard(){
      try{
         playerHandler.getPlayerList();



      }
      catch (IOException e){
         e.printStackTrace();
      }
   }
}
