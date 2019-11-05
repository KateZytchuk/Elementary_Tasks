package chess_board.validation;

import common.output.Constants;
import common.output.OutputInfo;

public class ChessDeskValidator {
    private static int [] ints;
    public  static boolean validateDimensions(String[] dimensions) {
        boolean isValidLength = dimensions.length == 2;
        if (!isValidLength) {
            OutputInfo.showMessage(Constants.ILLEGAL_INPUT);
        }
        return (isValidLength && isNumbers(dimensions) && isPositive());
    }

    private static boolean isNumbers(String[] str) {
        ints = new int[str.length];
        boolean result = true;
        for (int i = 0; i < str.length; i++) {
            try {
                ints[i] = Integer.parseInt(str[i]);
            } catch (NumberFormatException ex) {
                OutputInfo.showMessage(Constants.NUMBER_FORMAT_EXCEPTION_MESSAGE);
                result = false;
            }
        }
        return result;
    }

    private static boolean isPositive() {
        int count = 0;
        boolean result;
        for (int anInt : ints) {
            if (anInt > 0) {
                count++;
            }
        }
        if (count == 2) {
            result = true;
        } else {
            OutputInfo.showMessage(Constants.ILLEGAL_ARGUMENT_EXCEPTION);
            result = false;
        }
        return result;
    }
}
