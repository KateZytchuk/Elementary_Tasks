package envelopes.console;

import envelopes.domain.Envelope;
import envelopes.validation.EnvelopesValidator;

import java.util.Scanner;

public class InputForEnvelopes {

    public static int inputNumber(String message) {
        Scanner input = new Scanner(System.in);
        EnvelopesValidator validator = new EnvelopesValidator();
        int number = 0;
        boolean result;
        do {
            OutputInfo.showMessage(message);
            String numberOfEnvelopes = input.nextLine();
            result = validator.validateNumber(numberOfEnvelopes);
            if (result) {
                number = Integer.parseInt(numberOfEnvelopes);
            }
        } while (!result);
        return number;
    }

    public Envelope inputEnvelope(String str) {
        Scanner input = new Scanner(System.in);
        double[] dimensions = new double[2];
        boolean flag;
        do {
            OutputInfo.showMessage(str);
            String envelopeDimensions = input.nextLine();
            String[] dimensionsArr = envelopeDimensions.split(" ");
            EnvelopesValidator validator = new EnvelopesValidator();
            flag = validator.validEnvelope(dimensionsArr);
            if (flag) {
                for (int i = 0; i < dimensionsArr.length; i++) {
                    dimensions[i] = Double.parseDouble(dimensionsArr[i]);
                }
            }
        } while (dimensions[0] <= 0 | dimensions[1] <= 0);
        return new Envelope(dimensions[0], dimensions[1]);
    }
}
