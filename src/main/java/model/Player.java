package model;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Play> playList = new ArrayList<>();
    private Line line;

    public Player(String name) {
        this.name = name;
        this.setLine(new Line(this));
    }

    public String getName() {
        return name;
    }

    public List<Play> getPlayList() {
        return playList;
    }

    public Line getLine() {
        return line;
    }

    public void setPlayList (List<Play> playList){
        this.playList = playList;
    }

    public void setLine(Line line) {
        this.line = line;
    }
}
