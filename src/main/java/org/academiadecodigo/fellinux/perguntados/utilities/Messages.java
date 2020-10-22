package org.academiadecodigo.fellinux.perguntados.utilities;

public class Messages {

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



    //BEGIN
    public final static String WELCOME = GREEN+"\nWelcome brainfuck player!";
    public final static String LOGIN = "New player comes in";
    public final static String MENU_GET_INSTRUCTIONS = "Game instructions";
    public final static String MENU_START_GAME = "Start game";

    //WELCOME CONTROLLER
    public final static String PLAYER_NAME = "What is your name player?";
    public final static String ERROR_NAME = "this is a error";

    //WELCOME MENU
    public static final String PERGUNTADOS_SLOGAN = PURPLE+
            "  ______       __    __   _______      _______..___________. __    ______   .__   __.  _______  _______   __   __  \n" +
            " /  __  \\     |  |  |  | |   ____|    /       ||           ||  |  /  __  \\  |  \\ |  | |   ____||       \\ |  | |  | \n" +
            "|  |  |  |    |  |  |  | |  |__      |   (----``---|  |----`|  | |  |  |  | |   \\|  | |  |__   |  .--.  ||  | |  | \n" +
            "|  |  |  |    |  |  |  | |   __|      \\   \\        |  |     |  | |  |  |  | |  . `  | |   __|  |  |  |  ||  | |  | \n" +
            "|  `--'  '--. |  `--'  | |  |____ .----)   |       |  |     |  | |  `--'  | |  |\\   | |  |____ |  '--'  ||__| |__| \n" +
            " \\_____\\_____\\ \\______/  |_______||_______/        |__|     |__|  \\______/  |__| \\__| |_______||_______/ (__) (__)" +
                    "                                                                             "+ RESET;


    //ERROR MESSAGES
    public final static String VIEW_MAIN_ERROR = "ERROR: That is an invalid option";
    public final static String VIEW_MAIN_MESSAGE = "Please choose an option ";
    public final static String SYSTEM_ERROR = "The game is having some difficulties...";

    //QUIT OPTION
    public final static String MENU_QUIT = "Quit";

    //INSTRUCTIONS
    public final static String INSTRUCTION= (RED+"\nYou are not so stupid\n\n" +
            "The game is simple.\n" +
            "Put true if you agree with the displayed statement or false if you do not agree with the information presented \n"+
            "If you are reading the instructions more than once, you are stupid.\n"+RESET);


    public final static String WINNER=(
          YELLOW+
              " \n\n`7MMF'     A     `7MF'`7MMF'`7MN.   `7MF'`7MN.   `7MF'`7MM\"\"\"YMM  `7MM\"\"\"Mq.  \n" +
                   "  `MA     ,MA     ,V    MM    MMN.    M    MMN.    M    MM    `7    MM   `MM. \n" +
                   "   VM:   ,VVM:   ,V     MM    M YMb   M    M YMb   M    MM   d      MM   ,M9  \n" +
                   "    MM.  M' MM.  M'     MM    M  `MN. M    M  `MN. M    MMmmMM      MMmmdM9   \n" +
                   "    `MM A'  `MM A'      MM    M   `MM.M    M   `MM.M    MM   Y  ,   MM  YM.   \n" +
                   "     :MM;    :MM;       MM    M     YMM    M     YMM    MM     ,M   MM   `Mb. \n" +
                   "      VF      VF      .JMML..JML.    YM  .JML.    YM  .JMMmmmmMMM .JMML. .JMM."+RESET
            );

    public final static String LOOSER = ( RED+
            "\n\n" +
            "                                                                        \n" +
            "`7MMF'        .g8\"\"8q.     .g8\"\"8q.    .M\"\"\"bgd `7MM\"\"\"YMM  `7MM\"\"\"Mq.  \n" +
            "  MM        .dP'    `YM. .dP'    `YM. ,MI    \"Y   MM    `7    MM   `MM. \n" +
            "  MM        dM'      `MM dM'      `MM `MMb.       MM   d      MM   ,M9  \n" +
            "  MM        MM        MM MM        MM   `YMMNq.   MMmmMM      MMmmdM9   \n" +
            "  MM      , MM.      ,MP MM.      ,MP .     `MM   MM   Y  ,   MM  YM.   \n" +
            "  MM     ,M `Mb.    ,dP' `Mb.    ,dP' Mb     dM   MM     ,M   MM   `Mb. \n" +
            ".JMMmmmmMMM   `\"bmmd\"'     `\"bmmd\"'   P\"Ybmmd\"  .JMMmmmmMMM .JMML. .JMM."+ RESET

            );


}
