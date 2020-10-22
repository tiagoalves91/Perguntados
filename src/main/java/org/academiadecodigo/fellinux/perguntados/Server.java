package org.academiadecodigo.fellinux.perguntados;

import org.academiadecodigo.fellinux.perguntados.model.PlayerHandler;
import org.academiadecodigo.fellinux.perguntados.utilities.Messages;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {

    private ServerSocket serverSocket;


    private Socket playerSocket;
    private ExecutorService threadPool = Executors.newFixedThreadPool(3);

    public ArrayList<PlayerHandler> playerList = new ArrayList<PlayerHandler>();

    private int port = 8000;


    public Server(int port) {

        try {
            serverSocket = new ServerSocket(port);
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }

    public void start() throws IOException {

        while (true) {

            System.out.println("Waiting Connection.....");

            playerSocket = this.serverSocket.accept();

            PlayerHandler playerHandler = new PlayerHandler(playerSocket);
            playerList.add(playerHandler);

            threadPool.submit(playerHandler);

            System.out.println(Messages.LOGIN);
        }
    }
}



