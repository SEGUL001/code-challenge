package service;

import model.config.FileRecord;
import model.Player;
import util.PlayerService;

import java.util.List;
import java.util.stream.Collectors;

public class PlayerServiceImpl implements PlayerService {


   public List<Player> getPlayers(List<FileRecord> fileRecords) {
        List<String> namesInPlayList = fileRecords.stream().map(FileRecord::getName).collect(Collectors.toList());
        List<String> playerNames = namesInPlayList.stream().distinct().collect(Collectors.toList());
        return playerNames.stream().map(Player::new).collect(Collectors.toList());
    }
}
