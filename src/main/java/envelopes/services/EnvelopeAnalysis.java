package envelopes.services;

import envelopes.console.Constants;
import envelopes.console.InputMessages;
import envelopes.domain.Envelope;
import general.output.QuestionsToUser;
import validation.Validator;

import java.util.Scanner;
import java.util.logging.Logger;

public class EnvelopeAnalysis {

    private static final Logger LOGGER = Logger.getLogger(EnvelopeAnalysis.class.getName());

    private EnvelopeAnalysis() {
    }

    public static void compareEnvelopes() {
        String choice;
        Scanner in = new Scanner(System.in);
        do {
            inputDimensions();
            QuestionsToUser.continueWork();
            choice = in.nextLine();
        } while (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes"));
    }

    public static void inputDimensions() {
        double firstWidth;
        double firstLength;
        double secondWidth;
        double secondLength;
        int answer;
        try {
            Scanner input = new Scanner(System.in);
            InputMessages.inputFirstWidth();
            firstWidth = Double.parseDouble(input.nextLine());
            InputMessages.inputFirstLength();
            firstLength = Double.parseDouble(input.nextLine());
            InputMessages.inputSecondWidth();
            secondWidth = Double.parseDouble(input.nextLine());
            InputMessages.inputSecondLength();
            secondLength = Double.parseDouble(input.nextLine());
            Envelope first = new Envelope(firstWidth, firstLength);
            Envelope second = new Envelope(secondWidth, secondLength);
            answer = getAnalysis(first, second);
            switch (answer) {
                case 0:
                    LOGGER.info(Constants.EQUAL_ENVELOPES);
                    break;
                case 1:
                    LOGGER.info(Constants.FIRST_TO_SECOND);
                    break;
                case 2:
                    LOGGER.info(Constants.SECOND_TO_FIRST);
                    break;
                case 3:
                    LOGGER.info(Constants.DIAGONAL_ARRANGEMENT);
                    break;
                case -1:
                    LOGGER.info(Constants.CANNOT_PUT);
                    break;
                default:
                    break;
            }
        } catch (Exception ex) {
            Validator.printExceptionMessage();
        }
    }

    public static int getAnalysis(Envelope first, Envelope second) {
        int result;
        double a = first.getLength();
        double b = first.getWidth();
        double c = second.getLength();
        double d = second.getWidth();
        try {
            if (b <= 0 || a <= 0 || d <= 0 || c <= 0) {
                throw new IllegalArgumentException();
            }

            if ((b == d) && (a == c) || (a == d) && (b == c)) {
                result = 0;
            } else if (((b > d) && (a > c)) || ((b > c) && (a > d))) {
                result = 2;
            } else if (((d > b) && (c > a)) || ((d > a) && (c > b))) {
                result = 1;
            } else if (putOnDiagonal(a, b, c, d)) {
                result = 3;
            } else {
                result = -1;
            }
        } catch (Exception ex) {
            throw new IllegalArgumentException();
        }
        return result;
    }

    private static boolean putOnDiagonal(double a, double b, double c, double d) {
        double H, W, h, w, temp, formulaLeft, formulaRight;
        if (Math.abs(a - b) > Math.abs(c - d)) {
            H = c;
            W = d;
            h = a;
            w = b;
        } else {
            H = a;
            W = b;
            h = c;
            w = d;
        }
        temp = Math.max(H, W);
        H = Math.min(H, W);
        W = temp;
        temp = Math.max(h, w);
        h = Math.min(h, w);
        w = temp;
        formulaRight = (w * w - h * h);
        double repeatedExpr = w * w + h * h;
        formulaLeft = (H * Math.sqrt(repeatedExpr - W * W)) + (W * Math.sqrt(repeatedExpr - H * H));
        if (formulaLeft <= formulaRight) {
            return true;
        } else {
            return false;
        }
    }


}