// Jose Franco
// 02/28/2025
// M11 - Programming Assignment - Border Pane Example for JavaFX

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        BorderPane borderPane = new BorderPane();

        // Creating buttons for each region
        Button topButton = new Button("Top (Header)");
        Button bottomButton = new Button("Bottom (Footer)");
        Button leftButton = new Button("Left (Sidebar)");
        Button rightButton = new Button("Right (Side Panel)");
        Button centerButton = new Button("Center (Main Content)");

        // Assign buttons to BorderPane regions
        borderPane.setTop(topButton);
        borderPane.setBottom(bottomButton);
        borderPane.setLeft(leftButton);
        borderPane.setRight(rightButton);
        borderPane.setCenter(centerButton);

        // Set up the scene and stage
        Scene scene = new Scene(borderPane, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX BorderPane Example");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
