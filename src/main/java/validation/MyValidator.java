package validation;

import java.util.logging.Logger;

/**
 * Created by IntelliJ IDEA.
 * USER: zaets39
 * DATE: 19.10.2019
 * TIME: 15:25
 */

public class MyValidator {

    private static final Logger LOGGER = Logger.getLogger(MyValidator.class.getName());

    private MyValidator(){}

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
