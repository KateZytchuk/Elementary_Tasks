package envelopes.console;

import java.util.Scanner;

public class InputForEnvelopes {

    public static String inputNumber(String message) {
        Scanner input = new Scanner(System.in);
        OutputInfo.showMessage(message);
        String numberOfEnvelopes = input.nextLine();
        return numberOfEnvelopes;
    }

    public String[] inputEnvelope(String str) {
        Scanner input = new Scanner(System.in);
        OutputInfo.showMessage(str);
        String envelopeDimensions = input.nextLine();
        String[] dimensionsArr = envelopeDimensions.split(" ");
        return dimensionsArr;
    }
}
