package util;

import model.Player;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public interface PlayService {

    void getPlayList(Scanner inputStream, List<Player> playerList) throws  IOException;
}
