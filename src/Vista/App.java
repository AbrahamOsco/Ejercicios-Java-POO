package Vista;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.awt.*;

public class App extends Application {

    @Override
    public void start(Stage stage) {

        var label = new Label("Hello, JavaFX " + (12.3) + ", running on Java " + (12.3) + ".");
        var scene = new Scene(new StackPane(label), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
