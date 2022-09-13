import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {

        SceneController sceneController = new SceneController();

        // stage size and position
        stage.setHeight(Settings.WINDOW_HEIGHT);
        stage.setWidth(Settings.WINDOW_WIDTH);
        stage.setX(Settings.WINDOW_POSITION_X);
        stage.setY(Settings.WINDOW_POSITION_Y);

        // stage options
        stage.setResizable(Settings.STAGE_RESIZABLE);
        stage.setAlwaysOnTop(Settings.STAGE_ALWAYS_ON_TOP);

        // stage title
        stage.setTitle(Settings.STAGE_TITLE);

        // main scene by default
        sceneController.setCurrentScene(Settings.MAIN_KEY, stage);

        // finally, show scene
        stage.show();
    }
}
