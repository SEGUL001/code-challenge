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

    public String getPinFall() {
        return pinFall;
    }
}
