package start;

import numerical_sequence.services.FindNumbers;
import triangle_square.TriangleSort;
import chess_board.services.ChessOperations;

import java.util.Scanner;
import java.util.logging.Logger;

public class Program {
    private static final Logger LOGGER = Logger.getLogger(Program.class.getName());

    public static void main(String[] args) {
       // showMenu();
       /* EnvelopeAnalysis temp = new EnvelopeAnalysis();
        temp.compareEnvelopes();*/
       //FindNumbers.inputNumber();
        ChessOperations.getBoard();
    }

    private static void showMenu() {
        Scanner in = new Scanner(System.in);
        int number;
        LOGGER.info("Choose the program you want to execute:");
        LOGGER.info("1)Chess Board");
        LOGGER.info("2)Envelopes Analysis");
        LOGGER.info("3)Sorting of triangles");
        LOGGER.info("4)File parser");
        LOGGER.info("5)Number in words");
        LOGGER.info("6)Lucky tickets");
        LOGGER.info("7)Numeric sequence");
        LOGGER.info("8)Fibonacci series for range");
        LOGGER.info("9)Exponentiation");
        LOGGER.info("10)Storage");
        try {
            number = Integer.parseInt(in.nextLine());
            startChosenProgram(number);
        } catch (Exception ex) {
            //Validator.printExceptionMessage();
        }
    }

    private static void startChosenProgram(int number) {
        if (number == 1) {
            ChessOperations.getBoard();
        } else if (number == 2) {
           // EnvelopeAnalysis.compareEnvelopes();
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