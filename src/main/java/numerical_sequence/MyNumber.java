package numerical_sequence;

import validation.Validator;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Created by IntelliJ IDEA.
 * USER: zaets39
 * DATE: 20.10.2019
 * TIME: 15:55
 */

public class MyNumber {
    private static final Logger LOGGER = Logger.getLogger(MyNumber.class.getName());

    private MyNumber() {
    }

    public static void inputNumber() {
        String choice;
        Scanner in = new Scanner(System.in);
        do {
            LOGGER.info("Enter your number");
            int input = Integer.parseInt(in.nextLine());
            if (Validator.sequenceInputValidate(input)) {
                int[] numbersSequence = findNumbers(input);
                printSequence(numbersSequence);
            } else {
                Validator.printExceptionMessage();
            }
            LOGGER.info("DO you want to continue?");
            choice = in.nextLine();
        }while (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes"));

    }

    static int[] findNumbers(int number) {
        int temp = (int) Math.sqrt(number);
        int[] numbersInSequence = new int[temp];
        for (int i = 1; i <= temp; i++) {
            numbersInSequence[i - 1] = i;
        }
        return numbersInSequence;
    }

    static void printSequence(int[] sequence) {
        for (int i = 0; i < sequence.length; i++) {
            String temp = Integer.toString(sequence[i]);
            LOGGER.info(temp);
        }
    }
}
