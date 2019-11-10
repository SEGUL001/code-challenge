package service;

import model.*;
import util.ScoreBoardService;

import java.util.List;
public class ScoreBoardServiceServiceImpl implements ScoreBoardService {

    public void drawScoreBoard(List<Player> playerList){
        drawHeader();
        for (Player player: playerList){
            int pos = 0;
            List<Frame> scoredFrames = buildScores(player.getLine().getFrames());
            StringBuffer chances = new StringBuffer();
            StringBuffer scores = new StringBuffer();
            player.getLine().setFrames(scoredFrames);
            System.out.println(player.getName());
            chances.append("Pinfalls");
            chances.append("    ");
            scores.append("Score");
            scores.append("      ");
            for (Frame frame : player.getLine().getFrames()) {
                if(pos == player.getLine().getFrames().size() -1){

                    if (frame.getFirstChance().equals("10")) {
                        chances.append("X");
                    } else {
                        chances.append(frame.getFirstChance());
                    }

                    chances.append(" ");
                    chances.append(frame.getSecondChance());
                    chances.append(" ");
                    chances.append(frame.getThirdChance());
                } else
                if (frame.getFirstChance().equals("10")) {
                    chances.append("X");
                } else if (Integer.parseInt(frame.getSecondChance()) + Integer.parseInt(frame.getFirstChance()) == 10) {
                    chances.append(frame.getFirstChance());
                    chances.append(" /");
                } else {
                    chances.append(frame.getFirstChance());
                    chances.append(" ");
                    chances.append(frame.getSecondChance());
                }
                chances.append("    ");
                pos++;
            }

            for (Frame frame : player.getLine().getFrames()) {

                scores.append(frame.getScore());
                scores.append("    ");

            }


            System.out.println(chances);
            System.out.println(scores);
        }



    }


    public List<Frame> buildScores (List<Frame> frames){
        int score = 0;
        int j;
        Frame[] framesIntScore = new Frame[frames.size()];
        framesIntScore = frames.toArray(framesIntScore);

        for (Frame frame : framesIntScore) {
            if (frame.getFirstChance().equals("F")) {
                frame.setFirstChance("0");
            }
        }

        for (int i = 0; i < framesIntScore.length ; i++){

            if(i == framesIntScore.length - 1){
                score += Integer.parseInt(framesIntScore[i].getFirstChance()) + Integer.parseInt(framesIntScore[i].getSecondChance()) +Integer.parseInt(framesIntScore[i].getThirdChance());
            }else
            if(framesIntScore[i].getFirstChance().equals("10")){
                score += 10 + Integer.parseInt(framesIntScore[i+1].getFirstChance()) + Integer.parseInt(framesIntScore[i+1].getSecondChance());
            }else if(Integer.parseInt(framesIntScore[i].getFirstChance()) + Integer.parseInt(framesIntScore[i].getSecondChance()) == 10){
                score += 10 + Integer.parseInt(framesIntScore[i+1].getFirstChance());
            }else {
                score += Integer.parseInt(framesIntScore[i].getFirstChance()) + Integer.parseInt(framesIntScore[i].getSecondChance());
            }

            framesIntScore[i].setScore(score);
        }

        j = 0;
        for (Frame frame : frames){
            frame.setScore(framesIntScore[j].getScore());
            j++;
        }

        return frames;
    }

    public void drawHeader(){
        System.out.println("Frames       1     2     3     4     5      6      7      8      9      10");
    }


}
