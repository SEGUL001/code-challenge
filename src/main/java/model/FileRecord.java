package model;

public class FileRecord {
    private String name;
    private int Score;

    public FileRecord(String name, int score) {
        this.setName(name);
        setScore(score);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }
}
