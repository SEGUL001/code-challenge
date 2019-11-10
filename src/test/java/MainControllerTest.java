import controller.MainControllerImpl;
import org.junit.Test;
import service.PlayerServiceImpl;
import service.ScoreBoardServiceServiceImpl;
import service.config.FileReaderImpl;
import service.config.PropertiesPluginImpl;
import util.MainController;
import util.PlayerService;
import util.ScoreBoardService;
import util.config.FileReader;
import util.config.PropertiesPlugin;

public class MainControllerTest {
    @Test
    public void drawScoreBoardTestExampleTestData(){
        PropertiesPlugin propertiesPlugin = new PropertiesPluginImpl();
        PlayerService playerService = new PlayerServiceImpl();
        ScoreBoardService scoreBoardService = new ScoreBoardServiceServiceImpl();

        FileReader fileReader = new FileReaderImpl(propertiesPlugin);

        MainController mainController = new MainControllerImpl(playerService,fileReader,scoreBoardService);

        mainController.showScoreBoard();

    }

}
