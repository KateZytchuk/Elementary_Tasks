package common.validation;

import common.output.Constants;
import common.output.OutputInfo;

public class Validator {
    public static boolean validateNumber(String str) {
        boolean result;
        int number;
        try {
            number = Integer.parseInt(str);
            if (number > 1) {
                result = true;
            } else {
                OutputInfo.showMessage(Constants.ILLEGAL_INPUT);
                result = false;
            }
        } catch (NumberFormatException ex) {
            OutputInfo.showMessage(Constants.NUMBER_FORMAT_EXCEPTION_MESSAGE);
            result = false;
        }
        return result;
    }
}
