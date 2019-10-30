package numerical_sequence.services;

import validation.Validator;

import java.util.Scanner;
import java.util.logging.Logger;

public class InputNumber {
    private static final Logger LOGGER = Logger.getLogger(InputNumber.class.getName());

    private InputNumber() {
    }

    public static int inputData() {
        Scanner input = new Scanner(System.in);
        int temp = 0;
        do {
            try {
                temp = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException ex) {
                LOGGER.info("NumberFormatException");
            } catch (IllegalArgumentException ex) {
                Validator.printParseExceptionMessage();
            }
        } while (temp <= 1);
        return temp;
    }
}
