package model;

import java.util.ArrayList;
import java.util.List;

public class Line {
    Player player;
    private List<Frame> frames = new ArrayList<>();

    Line(Player player){
        this.player = player;
    }

    public List<Frame> getFrames() {
        return frames;
    }

    public void setFrames(List<Frame> frames) {
        this.frames = frames;
    }
}
