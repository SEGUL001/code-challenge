package model;

public class Frame {
    private String firstChance;
    private String secondChance;
    private int score;

    private String thirdChance;

    public Frame(String firstChance, String secondChance) {
        this.firstChance = firstChance;
        this.secondChance = secondChance;
    }

    public Frame(String firstChance, String secondChance, String thirdChance) {
        this.firstChance = firstChance;
        this.secondChance = secondChance;
        this.setThirdChance(thirdChance);
    }

    public String getFirstChance() {
        return firstChance;
    }

    public void setFirstChance(String firstChance) {
        this.firstChance = firstChance;
    }

    public String getSecondChance() {
        return secondChance;
    }

    public void setSecondChance(String secondChance) {
        this.secondChance = secondChance;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getThirdChance() {
        return thirdChance;
    }

    public void setThirdChance(String thirdChance) {
        this.thirdChance = thirdChance;
    }
}
