package envelopes.services;

import common.output.Constants;
import envelopes.console.InputForEnvelopes;
import envelopes.console.OutputInfo;
import envelopes.domain.Envelope;

import java.util.ArrayList;
import java.util.List;

public class Envelopes {
    private Envelopes() {
    }

    public static ArrayList<Envelope> getDimensions(String message, int number) {
        InputForEnvelopes input = new InputForEnvelopes();
        ArrayList<Envelope> inputEnvelopes = new ArrayList<Envelope>();
        Envelope envelope;
        inputEnvelopes.clear();
        OutputInfo.showMessage(message);
        for (int i = 0; i < number; i++) {
            envelope = input.inputEnvelope(Constants.ENTER_DIMENSION);
            inputEnvelopes.add(envelope);
        }
        return inputEnvelopes;
    }

    public static String compare(List<Envelope> envelopes) {
        boolean result;
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < envelopes.size(); i++) {
            output.append("\nYou can put in your ").append(i + 1).append(" envelope such envelopes: ");
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

    public static boolean analyze(Envelope first, Envelope second) {
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
