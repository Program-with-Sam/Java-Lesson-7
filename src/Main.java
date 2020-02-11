import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
    // Create a stage variable
    Stage mainStage;

    @Override
    public void start(Stage stage) throws Exception {
        // Create a new stage
        mainStage = new Stage();
        // Create a Pane
        Pane pane = new Pane();
        // Create the TextArea - the bit we type in
        TextArea area = new TextArea();
        // Set the size of the TextArea
        area.setPrefSize(400, 400);
        // Add the area to the pane
        pane.getChildren().addAll(area);
        // Create a scene with the pane of the given size
        Scene scene = new Scene(pane,400,400);
        // Set the stage's scene
        mainStage.setScene(scene);
        // Give the scene a title
        mainStage.setTitle("Notepad");
        // Make the window un-resizable
        mainStage.setResizable(false);
        // Show the window and wait
        mainStage.showAndWait();
    }
}
