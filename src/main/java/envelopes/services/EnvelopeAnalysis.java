package envelopes.services;

import common.output.Constants;
import envelopes.console.InputForEnvelopes;
import envelopes.console.OutputInfo;
import envelopes.domain.Envelope;

import java.util.ArrayList;
import java.util.Scanner;

public class EnvelopeAnalysis {

    public void run() {
        String choice;
        String result;
        ArrayList<Envelope> envelopes;
        Scanner in = new Scanner(System.in);
        do {
            int number = InputForEnvelopes.inputNumber(Constants.ENTER_NUMBER_OF_ENVELOPES);

            envelopes = Envelopes.getDimensions(Constants.ENVELOPE_MESSAGE, number);






            result = Envelopes.compare(envelopes);
            OutputInfo.showMessage(result);
            OutputInfo.showMessage(Constants.QUESTION_TO_USER);
            choice = in.nextLine();
        } while (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes"));
    }
}