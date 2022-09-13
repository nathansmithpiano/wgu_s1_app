import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.HashMap;

public class SceneController {

    private HashMap<String, Scene> sceneMap;

    // build scenes on init
    public SceneController() {
        sceneMap = new HashMap<>();

        sceneMap.put(Settings.MAIN_KEY, createMain());
    }

    public void setCurrentScene(String key, Stage stage) {
        if (sceneMap.containsKey(key)) {
            stage.setScene(sceneMap.get(key));
        } else {
            System.out.println(this.getClass().getSimpleName()
                    + "." + "setCurrentScene(" + key + ")"
                    + " ERROR: '" + key + "' not found in sceneMap");
        }
    }

    private Scene createMain() {
        // root/container Pane
        VBox rootVBox = new VBox();
        rootVBox.setPadding(Settings.ROOT_INSETS);

        // top pane: title
        HBox topHBox = new HBox();
        Text titleText = new Text();
        titleText.setFont(Settings.SCENE_TITLE_FONT);
        titleText.setText(Settings.MAIN_TITLE);
        topHBox.getChildren().add(titleText);
        rootVBox.getChildren().add(topHBox);

        // middle pane: Parts and Products pane with TableViews (used later also)
        HBox middleHBox = new HBox();
        // TODO: inner pane stuff
        // search field
        // add button
        // modify button
        // delete button

        // UNNECESSARY CHANGE



        rootVBox.getChildren().add(middleHBox);

        // bottom pane: single button
        HBox bottomHBox = new HBox();
        bottomHBox.setAlignment(Settings.MAIN_BOTTOM_ALIGNMENT);
        rootVBox.getChildren().add(bottomHBox);

        // exit button
        Button exitButton = new Button();
        exitButton.setText(Settings.MAIN_BUTTON_TEXT);
        bottomHBox.getChildren().add(exitButton);


        Scene scene = new Scene(rootVBox);
        return scene;
    }

    private VBox createTablePane(String type) {
        VBox vBox = new VBox();

        // top pane: title and search field
        HBox topBox = new HBox();
        Text innerPaneTitle = new Text();


        return vBox;
    }

    private TableView createProductsTable() {

        return null;
    }

    private TableView createPartsTable() {

        return null;
    }
}
