package chess_board.console;

import java.util.logging.Logger;

public class OutputData {
    private static final Logger LOGGER = Logger.getLogger(OutputData.class.getName());

    public static void printDesk(String desk) {
        LOGGER.info(desk);
    }
}
