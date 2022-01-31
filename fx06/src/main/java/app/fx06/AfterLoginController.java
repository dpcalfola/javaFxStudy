package app.fx06;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class AfterLoginController {

    @FXML
    Label nameLabel ;

    public void displayName(String userName){
        this.nameLabel.setText("Hello: " + userName );
    }



}
