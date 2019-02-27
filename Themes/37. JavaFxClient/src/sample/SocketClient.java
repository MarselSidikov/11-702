package sample;

import javafx.concurrent.Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * 26.02.2019
 * SocketClient
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class SocketClient extends Task<Void> {
    // поле, содержащее сокет-клиента
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    private Controller controller;

    public SocketClient(Controller controller) {
        this.controller = controller;
    }

    // начало сессии - получаем ip-сервера и его порт
    public void startConnection(String ip, int port) {
        try {
            // создаем подключение
            clientSocket = new Socket(ip, port);
            // получили выходной поток
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            // входной поток
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    @Override
    protected Void call() throws Exception {
        while (true) {
            try {
                System.out.println("In call");
                String response = in.readLine();
                if (response != null) {
                    controller.messages.appendText(response + "\n");
                }
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }
    }
}
