package model;

public class Play {
    private Player player;
    private String pinFall;

    public Play(){};

    public Play(Player player, String pinFall) {
        this.player = player;
        this.pinFall = pinFall;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getPinFall() {
        return pinFall;
    }

    public void setPinFall(String pinFall) {
        this.pinFall = pinFall;
    }
}
