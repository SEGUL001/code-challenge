package util;

import model.config.FileRecord;
import model.Player;

import java.io.IOException;
import java.util.List;

public interface FrameService {
    List<Player> buildFrames(List<Player> players, List<FileRecord> fileRecord) throws IOException;
}
