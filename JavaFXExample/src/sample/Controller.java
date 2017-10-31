package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Button helloButton;

    @FXML
    private Label helloLabel;

    @FXML
    public void initialize() {
        helloButton.setOnAction(event -> {
            helloLabel.setText("ПРИВЕТТТТТТ!!!!!!!!");
        });
    }

}
