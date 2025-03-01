// Jose Franco
// 02/28/2025
// M11 - Programming Assignment - Flow Pane Example for JavaFX

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Creating a FlowPane with horizontal spacing of 10 and vertical spacing of 15
        FlowPane flowPane = new FlowPane();
        flowPane.setHgap(10);
        flowPane.setVgap(15);

        // Adding buttons to the FlowPane
        for (int i = 1; i <= 10; i++) {
            flowPane.getChildren().add(new Button("Button " + i));
        }

        // Creating and setting the scene
        Scene scene = new Scene(flowPane, 400, 200);
        primaryStage.setTitle("JavaFX FlowPane Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
