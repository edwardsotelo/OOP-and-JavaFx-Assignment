import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Simple JavaFX starter window.
 * Used to verify JavaFX is configured correctly.
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        // basic label to show JavaFX is working
        Label messageLabel = new Label("JavaFX is working");

        // simple layout container
        StackPane root = new StackPane();
        root.getChildren().add(messageLabel);

        // create scene
        Scene scene = new Scene(root, 400, 200);

        // configure stage
        primaryStage.setTitle("JavaFX Test Window");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}