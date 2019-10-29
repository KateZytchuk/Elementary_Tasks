package envelopes.console;

import java.util.logging.Logger;

public class InputMessages {
    private static final Logger LOGGER = Logger.getLogger(InputMessages.class.getName());

    public static void inputFirstWidth() {
        LOGGER.info("Enter the width of first envelope ");
    }

    public static void inputFirstLength(){
        LOGGER.info("Enter the length of first envelope ");
    }

    public static void inputSecondWidth(){
        LOGGER.info("Enter the width of second envelope ");
    }

    public static void inputSecondLength(){
        LOGGER.info("Enter the length of second envelope ");
    }
}
