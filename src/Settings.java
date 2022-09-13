import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.text.Font;
import javafx.stage.Screen;

public abstract class Settings {

    // --------------------
    // STAGE (MAIN WINDOW)
    // --------------------
    protected static final int WINDOW_WIDTH = 800;
    protected static final int WINDOW_HEIGHT = 600;
    // position window at top left of primary screen
    public static final int WINDOW_POSITION_X = (int) Screen.getPrimary().getBounds().getMaxX() - WINDOW_WIDTH;
    public static final int WINDOW_POSITION_Y = 0;
    // options
    public static final boolean STAGE_RESIZABLE = false;
    public static final boolean STAGE_ALWAYS_ON_TOP = true;
    // other
    public static final String STAGE_TITLE = "Inventory Management System";

    // --------------------
    // ROOT PANE
    // --------------------
    public static final Insets ROOT_INSETS = new Insets(15, 12, 15, 12);

    // --------------------
    // ALL SCENES
    // --------------------
    public static final Font SCENE_TITLE_FONT = new Font(20);

    // --------------------
    // MAIN SCENE
    // --------------------
    public static final String MAIN_TITLE = STAGE_TITLE;
    public static final String MAIN_KEY = "main";
    public static final int MAIN_MIDDLE_SPACING = 10;
    public static final Pos MAIN_BOTTOM_ALIGNMENT = Pos.BOTTOM_RIGHT;
    public static final String MAIN_BUTTON_TEXT = "Exit";

    // --------------------
    // INNER PANES
    // --------------------
    public static final Font INNER_PANE_TITLE_FONT = new Font(16);

    // --------------------
    // TABLES
    // --------------------
    public static final int TABLE_PREF_WIDTH = (WINDOW_WIDTH / 2) - MAIN_MIDDLE_SPACING;
    public static final int TABLE_PREF_HEIGHT = 150;
}
