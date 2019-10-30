package envelopes.services;

import envelopes.console.Constants;
import envelopes.console.OutputInfo;
import envelopes.domain.Envelope;
import general.output.QuestionsToUser;

import java.util.Scanner;

public class EnvelopeAnalysis {

    private EnvelopeAnalysis() {
    }

    public static void compareEnvelopes() {
        String choice;
        Envelope[] envelopes;
        String result;
        Scanner in = new Scanner(System.in);
        do {
            envelopes = inputDimensions();
            result = analyze(envelopes[0], envelopes[1]);
            OutputInfo.printResult(result);
            QuestionsToUser.continueWork();
            choice = in.nextLine();
        } while (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes"));
    }

    public static Envelope[] inputDimensions() {
        double firstWidth;
        double firstLength;
        double secondWidth;
        double secondLength;
        Envelope first, second;
        OutputInfo.inputFirstWidth();
        firstWidth = InputDimensions.inputData();
        OutputInfo.inputFirstLength();
        firstLength = InputDimensions.inputData();
        OutputInfo.inputSecondWidth();
        secondWidth = InputDimensions.inputData();
        OutputInfo.inputSecondLength();
        secondLength = InputDimensions.inputData();
        first = new Envelope(firstWidth, firstLength);
        second = new Envelope(secondWidth, secondLength);
        return new Envelope[]{first, second};
    }

    public static String analyze(Envelope first, Envelope second) {
        String result;
        double a = first.getLength();
        double b = first.getWidth();
        double c = second.getLength();
        double d = second.getWidth();
        try {
            if ((b == d) && (a == c) || (a == d) && (b == c)) {
                result = Constants.EQUAL_ENVELOPES;
            } else if (((b > d) && (a > c)) || ((b > c) && (a > d))) {
                result = Constants.SECOND_TO_FIRST;
            } else if (((d > b) && (c > a)) || ((d > a) && (c > b))) {
                result = Constants.FIRST_TO_SECOND;
            } else if (putOnDiagonal(first, second)) {
                result = Constants.DIAGONAL_ARRANGEMENT;
            } else {
                result = Constants.CANNOT_PUT;
            }
        } catch (Exception ex) {
            throw new IllegalArgumentException();
        }
        return result;
    }

    private static boolean putOnDiagonal(Envelope first, Envelope second) {
        double H, W, h, w, temp, formulaLeft, formulaRight;
        Envelope.orderTwoEnvelopes(first, second);
        temp = Math.max(first.getLength(), first.getWidth());
        H = Math.min(first.getLength(), first.getWidth());
        W = temp;
        temp = Math.max(second.getLength(), second.getWidth());
        h = Math.min(second.getLength(), second.getWidth());
        w = temp;
        formulaRight = (w * w - h * h);
        double repeatedExpr = w * w + h * h;
        formulaLeft = (H * Math.sqrt(repeatedExpr - W * W)) + (W * Math.sqrt(repeatedExpr - H * H));
        return (formulaLeft <= formulaRight)? true:false;
    }
}