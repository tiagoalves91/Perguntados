package org.academiadecodigo.fellinux.perguntados.model;


import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;
import org.academiadecodigo.fellinux.perguntados.controller.ShowQuizController;
import org.academiadecodigo.fellinux.perguntados.utilities.Messages;
import org.academiadecodigo.fellinux.perguntados.view.ShowQuizView;
import org.academiadecodigo.fellinux.perguntados.view.UserOptions;


import java.io.*;
import java.net.Socket;


public class PlayerHandler implements Runnable {
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
    public static final String WHITE_BACKGROUND = "\u001B[40m";
    public static final String RED_BACKGROUND = "\u001B[41m";
    public static final String GREEN_BACKGROUND = "\u001B[42m";
    public static final String YELLOW_BACKGROUND = "\u001B[43m";
    public static final String PURPLE_BACKGROUND = "\u001B[45m";
    public static final String CYAN_BACKGROUND = "\u001B[46m";
    public static final String GREY_BACKGROUND = "\u001B[47m";

    private Socket socketPlayer;
    private PrintWriter printWriter;
    private Player player;


    public PlayerHandler(Socket socketPlayer) throws IOException {
        this.socketPlayer = socketPlayer;
        this.player = new Player();

        // this.prompt = new Prompt(this.socketPlayer.getInputStream(),new PrintStream(this.socketPlayer.getOutputStream()));

    }

    public void run() {
        try {
            Prompt prompt = new Prompt(socketPlayer.getInputStream(), new PrintStream(socketPlayer.getOutputStream()));

            printWriter = new PrintWriter(socketPlayer.getOutputStream());

            printWriter.write(Messages.PERGUNTADOS_SLOGAN);
            printWriter.flush();

            printWriter.write(Messages.WELCOME);
            printWriter.flush();

            StringInputScanner scanner = new StringInputScanner();
            scanner.setMessage("\n\n" + Messages.PLAYER_NAME);
            scanner.setError(Messages.ERROR_NAME);

            String name = prompt.getUserInput(scanner);

            printWriter.write("\n" + name + " good luck!\n");
            printWriter.flush();


            // create a menu with those options and set the message
            MenuInputScanner scanner2 = new MenuInputScanner(UserOptions.getMessages());
            scanner2.setMessage(Messages.VIEW_MAIN_MESSAGE);
            // show the menu to the user and get the selected answer
            int answerIndex = prompt.getUserInput(scanner2);

            switch (answerIndex) {
                case 1:
                    printWriter.write(Messages.INSTRUCTION);
                    printWriter.flush();
                    prompt.getUserInput(scanner2);
                    break;
                case 3:
                    this.socketPlayer.close();
                    break;


            }


            while (ShowQuizView.questCount < 10) {

                ShowQuizView showQuizView = new ShowQuizView();
                ShowQuizController showQuizController = new ShowQuizController();
                showQuizController.setView(showQuizView);

                showQuizView.setPrompt(prompt);
                showQuizView.show();
                showQuizController.init();

                if (ShowQuizView.questCount == 10) {
                    printWriter.write(YELLOW + name + " make " + ShowQuizView.pointsCount + " points" + RESET); // print the name of current player and you score;
                    printWriter.flush();
                    if (ShowQuizView.pointsCount < 6) {
                        printWriter.write(Messages.LOOSER);
                        printWriter.flush();
                        socketPlayer.close();
                        printWriter.close();
                    }
                    printWriter.write(Messages.WINNER);
                    printWriter.flush();
                    socketPlayer.close();
                    printWriter.close();

                    ShowQuizView.questCount = 0;
                    ShowQuizView.pointsCount = 0;


                }


            }

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public void showInstructions() {

        printWriter.write("\n\n\n\n\n\n If you know programming, you should be fine");
        printWriter.flush();

    }
}


