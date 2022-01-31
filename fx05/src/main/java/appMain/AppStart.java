package appMain;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AppStart extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        try {
            FXMLLoader root = new FXMLLoader(AppStart.class.getResource("view.fxml"));
            Scene scene = new Scene(root.load());


            String css = this.getClass().getResource("style.css").toExternalForm();

            scene.getStylesheets().add(css);



            stage.setTitle("Hello!");
            stage.setScene(scene);
            stage.show();

        }catch (Exception e){
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        launch();
    }
}