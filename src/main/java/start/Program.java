package start;

import common.output.Constants;
import envelopes.console.OutputInfo;
import envelopes.services.EnvelopeAnalysis;
import numerical_sequence.services.FindNumbers;
import triangle_square.TriangleSort;

import java.util.Scanner;
import java.util.logging.Logger;

public class Program {
    private static final Logger LOGGER = Logger.getLogger(Program.class.getName());

    public static void main(String[] args) {
        showMenu();
    }

    private static void showMenu() {
        Scanner input = new Scanner(System.in);
        int temp = 0;
        do {
            LOGGER.info(Constants.PROGRAM_MENU);
            try {
                temp = Integer.parseInt(input.nextLine());
                startChosenProgram(temp);
            } catch (NumberFormatException ex) {
                OutputInfo.showMessage(Constants.NUMBER_FORMAT_EXCEPTION_MESSAGE);
            } catch (IllegalArgumentException ex) {
                OutputInfo.showMessage(Constants.ILLEGAL_ARGUMENT_EXCEPTION);
            }
        } while (temp <= 0 || temp > 10);
    }

    private static void startChosenProgram(int number) {
        if (number == 1) {
            // ChessOperations.getBoard();
        } else if (number == 2) {
            EnvelopeAnalysis temp = new EnvelopeAnalysis();
            temp.run();
        } else if (number == 7) {
            FindNumbers.inputNumber();
        } else if (number == 3) {
            TriangleSort.inputData();
        } else {
            showMessage();
        }
    }

    private static void showMessage() {
        LOGGER.info("Sorry, not implemented yet:(");
    }
}