package app.fx07;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;

import java.io.IOException;


public class StartController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Button btn1;
    private Button btn2;

    @FXML
    void button1(ActionEvent event) throws IOException {
        System.out.println("1");
        root = FXMLLoader.load(getClass().getResource("hello-view2.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
//        stage.show();


    }

    @FXML
    void button2(ActionEvent event) throws IOException {
        System.out.println("go to first scene");
        root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
//        stage.show();

    }

    @FXML
    void button3(MouseEvent event) {
        System.out.println("hello3");

    }

    @FXML
    void button4(MouseEvent event) {
        System.out.println("hello4");

    }

    @FXML
    void button5(MouseEvent event) {
        System.out.println("hello5");

    }

}

