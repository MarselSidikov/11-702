package ru.itis.sockets.programs.servers;

import ru.itis.sockets.servers.ChatMultiServer;

public class ProgramChatMultiServerStart {
    public static void main(String[] args) {
        ChatMultiServer server = new ChatMultiServer();
        server.start(6666);
    }
}
