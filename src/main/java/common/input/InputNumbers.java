package common.input;

import common.output.OutputInfo;

import java.util.Scanner;

public class InputNumbers {

    public static String[] inputDimensions(String str) {
        Scanner input = new Scanner(System.in);
        OutputInfo.showMessage(str);
        String envelopeDimensions = input.nextLine();
        String[] dimensionsArr = envelopeDimensions.split(" ");
        return dimensionsArr;
    }
}
