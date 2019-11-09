package util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface PlayerHandler {

    List getPlayerList() throws FileNotFoundException, IOException;
}
