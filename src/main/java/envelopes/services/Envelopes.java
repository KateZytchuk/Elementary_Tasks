package envelopes.services;

import common.input.InputNumber;
import common.output.Constants;
import common.validation.Validator;
import common.input.InputNumbers;
import common.output.OutputInfo;
import envelopes.domain.Envelope;
import envelopes.validation.EnvelopesValidator;

import java.util.ArrayList;
import java.util.List;

public class Envelopes {
    private Envelopes() {
    }

    public static int getNumber(String message) {
        String numberOfEnvelopes;
        int number = 0;
        boolean flag;
        do {
            numberOfEnvelopes = InputNumber.inputNumber(message);
            flag = Validator.validateNumber(numberOfEnvelopes);
            if (flag) {
                number = Integer.parseInt(numberOfEnvelopes);
            }
        } while (!flag);
        return number;
    }

    public static ArrayList<Envelope> getDimensions(String message, int number) {
        InputNumbers input = new InputNumbers();
        ArrayList<Envelope> inputEnvelopes = new ArrayList<Envelope>();
        EnvelopesValidator validator = new EnvelopesValidator();
        String[] stringDimensions;
        Envelope envelope;
        double width;
        double length;
        boolean flag;
        inputEnvelopes.clear();
        OutputInfo.showMessage(message);
        do {
            stringDimensions = input.inputDimensions(Constants.ENTER_DIMENSION);
            flag = validator.validEnvelope(stringDimensions);
            if (flag) {
                width = Double.parseDouble(stringDimensions[0]);
                length = Double.parseDouble(stringDimensions[1]);
                envelope = new Envelope(width, length);
                inputEnvelopes.add(envelope);
            }
        } while (inputEnvelopes.size() < number);
        return inputEnvelopes;
    }

    public static String compare(List<Envelope> envelopes) {
        boolean result;
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < envelopes.size(); i++) {
            output.append("\nYou can put in your ").append(i + 1).append(" envelope such envelopes:");
            for (int j = 0; j < envelopes.size(); j++) {
                if (i != j) {
                    result = analyze(envelopes.get(i), envelopes.get(j));
                    if (result) {
                        output.append(" ").append(j + 1);
                    }
                }
            }
        }
        return output.toString();
    }

    private static boolean analyze(Envelope first, Envelope second) {
        boolean notEquals = !((first.getLength() == second.getLength()) && (first.getWidth() == second.getWidth()));

        boolean cantFit = ((first.getLength() > second.getLength()) && (first.getWidth() > second.getWidth())
                || ((first.getWidth() > second.getLength()) && (first.getLength() > second.getWidth())));

        boolean diagonalArrangement = putOnDiagonal(first, second);

        return ((notEquals && cantFit) || (notEquals && diagonalArrangement));
    }

    private static boolean putOnDiagonal(Envelope first, Envelope second) {
        double formulaRight = (Math.pow(second.getLength(), 2) - Math.pow(second.getWidth(), 2));

        double repeatedExpr = (Math.pow(second.getLength(), 2) + Math.pow(second.getWidth(), 2));

        double formulaLeft = (first.getLength() * Math.sqrt(repeatedExpr - Math.pow(first.getWidth(), 2)))
                + (first.getWidth() * Math.sqrt(repeatedExpr - Math.pow(first.getLength(), 2)));

        return (formulaLeft <= formulaRight
                && first.getWidth() + first.getLength() > second.getWidth() + second.getLength());
    }
}
