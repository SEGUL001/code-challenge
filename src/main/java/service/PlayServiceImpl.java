package service;

import model.config.FileRecord;
import model.Play;
import model.Player;

import util.config.PlayService;

import java.util.ArrayList;
import java.util.List;

public class PlayServiceImpl implements PlayService {
    public List<Play> buildPlayList(List<FileRecord> fileRecords, Player player) {
        List<Play> plays = new ArrayList<>();
        for (FileRecord fileRecord : fileRecords) {
            if (fileRecord.getName().equals(player.getName())) {
                plays.add(new Play(player, fileRecord.getPinFall()));
            }
        }
        return plays;
    }
}
