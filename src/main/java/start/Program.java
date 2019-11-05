package start;

import chess_board.services.ChessRun;
import common.output.Constants;
import common.output.OutputInfo;
import envelopes.services.EnvelopeAnalysis;
import numerical_sequence.services.Numbers;

import java.util.Scanner;
import java.util.logging.Logger;

public class Program {
    private static final Logger LOGGER = Logger.getLogger(Program.class.getName());

    public static void main(String[] args) {
        String choice;
        Scanner in = new Scanner(System.in);
        do {
            showMenu();
            OutputInfo.showMessage(Constants.QUESTION_TO_USER);
            choice = in.nextLine();
        } while (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes"));
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
        } while (temp <= 0 || temp > 3);
    }

    private static void startChosenProgram(int number) {
        if (number == 1) {
            ChessRun chess = new ChessRun();
            chess.run();
        } else if (number == 2) {
            EnvelopeAnalysis temp = new EnvelopeAnalysis();
            temp.run();
        } else if (number == 3) {
            Numbers numbers = new Numbers();
            numbers.run();
        } else {
            showMenu();
        }
    }
}