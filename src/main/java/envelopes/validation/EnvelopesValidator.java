package envelopes.validation;

import common.output.Constants;
import envelopes.console.OutputInfo;

public class EnvelopesValidator {
   private double[] doubles;

    public boolean validateNumber(String str) {
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

    public boolean validEnvelope(String[] dimensions) {
        boolean isValidLength = dimensions.length == 2;
        if (!isValidLength) {
            OutputInfo.showMessage(Constants.ILLEGAL_INPUT);
        }
        return (isValidLength && isNumbers(dimensions) && isPositive());
    }

    private boolean isNumbers(String[] str) {
        doubles = new double[str.length];
        boolean result = true;
        for (int i = 0; i < str.length; i++) {
            try {
                doubles[i] = Double.parseDouble(str[i]);
            } catch (NumberFormatException ex) {
                OutputInfo.showMessage(Constants.NUMBER_FORMAT_EXCEPTION_MESSAGE);
                result = false;
            }
        }
        return result;
    }

    private boolean isPositive() {
        int count = 0;
        boolean result;
        for (int i = 0; i < doubles.length; i++) {
            if (doubles[i] > 0) {
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