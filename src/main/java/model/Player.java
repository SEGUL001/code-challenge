package model;

import java.util.ArrayList;
import java.util.List;

public class Player {
    String name;
    private List<Play> playList = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Play> getPlayList() {
        return playList;
    }

    public void setPlayList(List<Play> playList) {
        this.playList = playList;
    }
}
