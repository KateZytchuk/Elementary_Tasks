package numerical_sequence.services;

import common.output.Constants;
import common.output.OutputInfo;

import java.util.Scanner;

public class Numbers {

    public void run() {
        String choice;
        String sequence;
        int number = 0;
        Scanner in = new Scanner(System.in);
        do {
            number = FindNumbers.getNumber(Constants.ENTER_NUMBER);
            sequence = FindNumbers.findNumbers(number);
            FindNumbers.print(sequence);
            OutputInfo.showMessage(Constants.QUESTION_TO_USER);
            choice = in.nextLine();
        } while (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes"));
    }
}
