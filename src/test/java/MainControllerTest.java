import controller.MainControllerImpl;
import org.junit.Test;
import service.PlayerHandlerImpl;
import service.config.FileReaderImpl;
import service.config.PropertiesPluginImpl;
import util.MainController;
import util.PlayerHandler;
import util.config.FileReader;
import util.config.PropertiesPlugin;

public class MainControllerTest {
    @Test
    public void drawScoreBoardTest(){
        PropertiesPlugin propertiesPlugin = new PropertiesPluginImpl();
        FileReader fileReader = new FileReaderImpl(propertiesPlugin);
        PlayerHandler playerHandler = new PlayerHandlerImpl(fileReader);
        MainController mainController = new MainControllerImpl(playerHandler);

        mainController.getScoreBoard();

    }

}
