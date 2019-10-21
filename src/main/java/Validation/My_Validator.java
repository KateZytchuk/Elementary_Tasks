package Validation;

/**
 * Created by IntelliJ IDEA.
 * USER: zaets39
 * DATE: 19.10.2019
 * TIME: 15:25
 */

public class My_Validator {
    public static void validateChessDimentions(int length, int width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void printExceptionMessage() {
        System.out.println("OOPS! Something went wrong!");
    }

    public static boolean sequenceInputValidate(int number) {
        if (number <= 1) {
            return false;
        } else {
            return true;
        }
    }
}
