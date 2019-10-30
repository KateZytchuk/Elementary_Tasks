package validation;

import java.util.logging.Logger;

public class Validator {

    private static final Logger LOGGER = Logger.getLogger(Validator.class.getName());

    private Validator(){}

    public static void validateChessDimentions(int length, int width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void printParseExceptionMessage() {
        LOGGER.info("Can`t parse your input");
    }

    public static boolean sequenceInputValidate(int number) {
        return (number<=1)? false:true;
    }
}
