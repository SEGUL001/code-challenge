package util.config;

import model.FileRecord;
import model.Play;
import model.Player;

import java.util.List;

public interface PlayService {
    List<Play> buildPlayList(List<FileRecord> fileRecords, Player player);
}
