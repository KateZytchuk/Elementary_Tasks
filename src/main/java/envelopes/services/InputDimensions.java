package envelopes.services;

import validation.Validator;

import java.util.Scanner;
import java.util.logging.Logger;

public class InputDimensions {
    private InputDimensions() {
    }

    private static final Logger LOGGER = Logger.getLogger(InputDimensions.class.getName());

    public static double inputData() {
        Scanner input = new Scanner(System.in);
        double temp = 0;
        do {
            try {
                temp = Double.parseDouble(input.nextLine());
            } catch (NumberFormatException ex) {
                LOGGER.info("NumberFormatException");
            } catch (IllegalArgumentException ex) {
                Validator.printParseExceptionMessage();
            }
        } while (temp <= 0);
        return temp;
    }
}
