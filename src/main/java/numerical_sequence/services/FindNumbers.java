package numerical_sequence.services;

import common.input.InputNumber;
import common.output.OutputInfo;
import common.validation.Validator;

import java.util.ArrayList;

public class FindNumbers {

    private FindNumbers() {
    }

    static String findNumbers(int number) {
        int temp = (int) Math.sqrt(number);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 1; i <= temp; i++) {
            numbers.add(i);
        }
        return numbers.toString();
    }

    static void print(String sequence) {
        OutputInfo.showMessage(sequence);
    }

    static int getNumber(String str) {
        String numberString;
        boolean flag;
        int number = 0;
        do {
            numberString = InputNumber.inputNumber(str);
            flag = Validator.validateNumber(numberString);
            if (flag) {
                number = Integer.parseInt(numberString);
            }
        } while (!flag);
        return number;
    }
}
