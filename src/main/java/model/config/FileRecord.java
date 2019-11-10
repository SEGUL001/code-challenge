package model.config;

public class FileRecord {
    private String name;
    private String pinFall;

    public FileRecord(String name, String pinFall) {
        this.name =name;
        this.pinFall =pinFall;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPinFall() {
        return pinFall;
    }

    public void setPinFall(String pinFall) {
        this.pinFall = pinFall;
    }
}
