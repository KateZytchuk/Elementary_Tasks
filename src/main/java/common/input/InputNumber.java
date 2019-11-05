package common.input;

import common.output.OutputInfo;

import java.util.Scanner;

public class InputNumber {
    public static String inputNumber(String message) {
        Scanner input = new Scanner(System.in);
        OutputInfo.showMessage(message);
        String numberOfEnvelopes = input.nextLine();
        return numberOfEnvelopes;
    }
}
