import controller.MainControllerImpl;
import org.junit.Test;
import service.FrameServiceImpl;
import service.PlayServiceImpl;
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
        PlayServiceImpl playService = new PlayServiceImpl();
        ScoreBoardService scoreBoardService = new ScoreBoardServiceServiceImpl();
        FrameServiceImpl frameService = new FrameServiceImpl(playService);

        FileReader fileReader = new FileReaderImpl(propertiesPlugin, "example_file");

        MainController mainController = new MainControllerImpl(playerService,fileReader,scoreBoardService, frameService);

        mainController.showScoreBoard();

    }

    @Test
    public void drawScoreBoardTestPerfectScoreData(){
        PropertiesPlugin propertiesPlugin = new PropertiesPluginImpl();
        PlayerService playerService = new PlayerServiceImpl();
        PlayServiceImpl playService = new PlayServiceImpl();
        ScoreBoardService scoreBoardService = new ScoreBoardServiceServiceImpl();
        FrameServiceImpl frameService = new FrameServiceImpl(playService);

        FileReader fileReader = new FileReaderImpl(propertiesPlugin, "perfect_score");

        MainController mainController = new MainControllerImpl(playerService,fileReader,scoreBoardService, frameService);

        mainController.showScoreBoard();

    }

    @Test
    public void drawScoreBoardTestZeroScoreData(){
        PropertiesPlugin propertiesPlugin = new PropertiesPluginImpl();
        PlayerService playerService = new PlayerServiceImpl();
        PlayServiceImpl playService = new PlayServiceImpl();
        ScoreBoardService scoreBoardService = new ScoreBoardServiceServiceImpl();
        FrameServiceImpl frameService = new FrameServiceImpl(playService);

        FileReader fileReader = new FileReaderImpl(propertiesPlugin, "zero_score");

        MainController mainController = new MainControllerImpl(playerService,fileReader,scoreBoardService, frameService);

        mainController.showScoreBoard();

    }
}
