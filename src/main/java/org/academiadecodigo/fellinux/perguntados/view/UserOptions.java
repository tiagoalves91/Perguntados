package org.academiadecodigo.fellinux.perguntados.view;

import org.academiadecodigo.fellinux.perguntados.utilities.Messages;


public enum UserOptions {


    GET_INSTRUCTIONS(1, Messages.MENU_GET_INSTRUCTIONS),
    START_GAME(2, Messages.MENU_START_GAME),
    QUIT(3, Messages.MENU_QUIT);


    private int option;
    private String message;


    UserOptions(int option, String message) {
        this.option = option;
        this.message = message;
    }

    public int getOption() {
        return option;
    }


    public String getMessage() {
        return message;
    }

    public static String[] getMessages() {
        String[] messages = new String[values().length];

        for (UserOptions option : values()) {
            messages[option.getOption() - 1] = option.getMessage();
        }
        return messages;
    }

}
