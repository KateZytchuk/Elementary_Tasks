package numerical_sequence.services;

import general.inputData.InputInteger;
import numerical_sequence.console.OutputInfo;
import numerical_sequence.domain.IntegersSequence;

import java.util.Scanner;
import java.util.logging.Logger;

public class FindNumbers {
    private static final Logger LOGGER = Logger.getLogger(FindNumbers.class.getName());

    private FindNumbers() {
    }

    public static void inputNumber() {
        String choice;
        int temp = 0;
        Scanner in = new Scanner(System.in);
        do {
            OutputInfo.numberMessage();
            temp = InputInteger.inputData();
            findNumbers(temp);
            IntegersSequence.print();
            LOGGER.info("DO you want to continue?");
            choice = in.nextLine();
        } while (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes"));

    }

    static void findNumbers(int number) {
        int temp = (int) Math.sqrt(number);
        for (int i = 0; i < temp; i++) {
            IntegersSequence.add(i + 1);
        }
    }
}
