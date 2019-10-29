package validation;

import java.util.logging.Logger;

/**
 * Created by IntelliJ IDEA.
 * USER: zaets39
 * DATE: 19.10.2019
 * TIME: 15:25
 */

public class Validator {

    private static final Logger LOGGER = Logger.getLogger(Validator.class.getName());

    private Validator(){}

    public static void validateChessDimentions(int length, int width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void printExceptionMessage() {
        LOGGER.info("OOPS! Something went wrong!");
    }

    public static boolean sequenceInputValidate(int number) {
        return (number<=1)? false:true;
    }
}
