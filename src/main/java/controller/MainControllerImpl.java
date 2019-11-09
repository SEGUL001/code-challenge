package controller;

import model.Player;
import util.config.FileReader;
import util.MainController;
import util.PlayerHandler;
import util.config.PropertiesPlugin;

public class MainControllerImpl implements MainController {


   private PlayerHandler playerHandler;


   public MainControllerImpl( PlayerHandler playerHandler) {
      this.playerHandler = playerHandler;
   }

   public void getScoreBoard(){

   playerHandler.getPlayerList();


   }



}
