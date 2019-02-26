package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Controller {

    @FXML
    TextArea messages;

    @FXML
    public void initialize() {
        SocketClient client = new SocketClient(this);
        client.startConnection("127.0.0.1", 6666);
        ExecutorService service = Executors.newFixedThreadPool(1);
        service.execute(client);
    }
}
