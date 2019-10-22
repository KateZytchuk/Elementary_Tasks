package envelopes;

import triangle_square.Triangle;
import validation.MyValidator;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Created by IntelliJ IDEA.
 * USER: zaets39
 * DATE: 17.10.2019
 * TIME: 13:09
 */

public class EnvelopeAnalysis {

    private static final Logger LOGGER = Logger.getLogger(EnvelopeAnalysis.class.getName());

    private static final String FIRST_TO_SECOND = "You can put your first envelope to second";
    private static final String SECOND_TO_FIRST = "You can put your second envelope to first";
    private static final String CANNOT_PUT = "You can`t put your one envelope to another";
    private static final String EQUAL_ENVELOPES = "Your envelopes are equal so, you can`t put one envelope to another";
    private static final String DIAGONAL_ARRAGMENT = "You can put on a diagonal your narrow and long envelop to another";

    private EnvelopeAnalysis() {
    }

    public static void similizeEnvelopes() {
        String choice;
        Scanner in = new Scanner(System.in);
        do {
            inputDimensions();
            LOGGER.info("Would you like to continue?");
            choice = in.nextLine();
        } while (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes"));
        in.close();
    }

    public static int getAnalysis(Envelope first, Envelope second)
            throws IllegalArgumentException {
        int result;
        double a = first.getLength();
        double b = first.getWidth();
        double c = second.getLength();
        double d = second.getWidth();

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
        return result;
    }

    private static boolean putOnDiagonal(double a, double b, double c, double d){
        double H, W, h, w, temp, formulaLeft, formulaRight;
            if(Math.abs(a-b) > Math.abs(c-d))
            {
                H = c;
                W = d;
                h = a;
                w = b;
            }
            else {
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

    public static void inputDimensions() {
        double firstWidth;
        double firstLength;
        double secondWidth;
        double secondLength;
        int answer;
        try {
            Scanner in = new Scanner(System.in);
            LOGGER.info("Enter the width of first envelope:");
            firstWidth = Double.parseDouble(in.nextLine());
            LOGGER.info("Enter the length of first envelope:");
            firstLength = Double.parseDouble(in.nextLine());
            LOGGER.info("Enter the width of second envelope:");
            secondWidth = Double.parseDouble(in.nextLine());
            LOGGER.info("Enter the length of second envelope:");
            secondLength = Double.parseDouble(in.nextLine());
            in.close();
            Envelope first = new Envelope(firstWidth, firstLength);
            Envelope second = new Envelope(secondWidth, secondLength);
            answer = getAnalysis(first, second);
            switch (answer) {
                case 0:
                    LOGGER.info(EQUAL_ENVELOPES);
                    break;
                case 1:
                    LOGGER.info(FIRST_TO_SECOND);
                    break;
                case 2:
                    LOGGER.info(SECOND_TO_FIRST);
                    break;
                case 3:
                    LOGGER.info(DIAGONAL_ARRAGMENT);
                    break;
                case -1:
                    LOGGER.info(CANNOT_PUT);
                    break;
                default:
                    break;
            }
        } catch (Exception ex) {
            MyValidator.printExceptionMessage();
        }
    }
}