package util;

import model.config.FileRecord;
import model.Player;

import java.util.List;

public interface PlayerService {
    List<Player> getPlayers(List<FileRecord> fileRecords);
}
