package service;

import model.config.FileRecord;
import model.Frame;
import model.Play;
import model.Player;
import util.FrameService;

import java.io.IOException;
import java.util.List;

public class FrameServiceImpl implements FrameService {

    private PlayServiceImpl playService;

    public FrameServiceImpl(PlayServiceImpl playService){
        this.playService = playService;
    }

    public List<Player> buildFrames(List<Player> players, List<FileRecord> fileRecord) throws IOException {

        for (Player player: players){
            player.setPlayList(playService.buildPlayList(fileRecord, player));
            int pos = 0;
            String firstChance = "";
            String secondChance = "";
            for (Play play : player.getPlayList()) {
                if(player.getLine().getFrames().size() == 9){
                    if (pos == 0){
                        firstChance = play.getPinFall();
                        pos++;
                    } else if (pos == 1){
                        secondChance = play.getPinFall();
                        pos++;
                    } else{
                        player.getLine().getFrames().add(new Frame(firstChance, secondChance, play.getPinFall()));
                    }
                } else
                if (play.getPinFall().equals("F")){
                    firstChance = "F";
                    pos++;
                }
                else if (Integer.parseInt(play.getPinFall())==10){
                    Frame frame = new Frame("10", "0");
                    player.getLine().getFrames().add(frame);
                    pos = 0;
                }
                else if (pos == 1){
                    Frame frame  = new Frame(firstChance, play.getPinFall());
                    player.getLine().getFrames().add(frame);
                    pos = 0;
                }
                else {
                    firstChance = play.getPinFall();
                    pos++;
                }
            }
        }
        return players;
    }
}
