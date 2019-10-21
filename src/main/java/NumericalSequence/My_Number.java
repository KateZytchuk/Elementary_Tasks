package NumericalSequence;

import Validation.My_Validator;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * USER: zaets39
 * DATE: 20.10.2019
 * TIME: 15:55
 */

public class My_Number {
    public static void inputNumber() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number");
        int input = Integer.parseInt(in.next());
        if (My_Validator.sequenceInputValidate(input)) {
            int[] numbersSequence = findNumbers(input);
            printSequence(numbersSequence);
        } else {
            My_Validator.printExceptionMessage();
        }
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
            System.out.println(i + "\t");
        }
    }
}
