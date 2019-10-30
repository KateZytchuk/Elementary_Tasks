package chess_board.console;

import java.util.logging.Logger;

public class InfoForUser {
    private static final Logger LOGGER = Logger.getLogger(InfoForUser.class.getName());

    public static void askForFirstDimension() {
        LOGGER.info("Enter the length of Chess Board");
    }

    public static void askForSecondDimension() {
        LOGGER.info("Enter the width of Chess Board");
    }
}
