package numerical_sequence.services;

import common.inputData.InputInteger;
//import common.output.QuestionsToUser;
import numerical_sequence.console.OutputInfo;
import numerical_sequence.domain.IntegersSequence;

import java.util.Scanner;

public class FindNumbers {

    private FindNumbers() {
    }

    public static void inputNumber() {
        String choice;
        int temp = 0;
        Scanner in = new Scanner(System.in);
        do {
            OutputInfo.numberMessage();
          //  temp = InputInteger.inputData();
            findNumbers(temp);
            IntegersSequence.print();
           // QuestionsToUser.continueWork();
            choice = in.nextLine();
        } while (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes"));

    }

    static void findNumbers(int number) {
        int temp = (int) Math.sqrt(number);
        IntegersSequence.clear();
        for (int i = 0; i < temp; i++) {
            IntegersSequence.add(i + 1);
        }
    }
}
