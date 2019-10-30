package chess_board;

import validation.Validator;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Created by IntelliJ IDEA.
 * USER: zaets39
 * DATE: 19.10.2019
 * TIME: 15:12
 */

public class ChessOperations {
    private static final Logger LOGGER = Logger.getLogger(ChessOperations.class.getName());

    private ChessOperations() {
    }

    public static void getBoard() {
        String choice;
        Scanner in = new Scanner(System.in);
        do {
            inputSize();
            LOGGER.info("Would you like to continue?");
            choice = in.nextLine();
        } while (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes"));
        in.close();
    }

    static char[][] createChessDesc(ChessDesk desk) {
     //   Validator.validateChessDimentions(desk.getLength(), desk.getWidth());
        int length = desk.getLength();
        int width = desk.getWidth();
        char[][] board = new char[length][width];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                if ((i + j) % 2 == 0) {
                    board[i][j] = '*';
                } else {
                    board[i][j] = ' ';
                }
            }
        }
        printChessDesc(board);
        return board;
    }

    static void printChessDesc(char[][] desc) {
        for (int i = 0; i < desc.length; i++) {
            for (int j = 0; j < desc[i].length; j++) {
                System.out.print(desc[i][j]+ "\t"); // Google how to print symbols in loggers
            }
            System.out.println();
        }
    }

    static void inputSize() {
        Scanner in = new Scanner(System.in);
        try {
            LOGGER.info("Enter the length of Chess Board:");
            int length = Integer.parseInt(in.nextLine());
            LOGGER.info("Enter the width of Chess Board:");
            int width = Integer.parseInt(in.nextLine());
            ChessDesk desk = new ChessDesk(length, width);
            createChessDesc(desk);
        } catch (Exception ex) {
            //Validator.printExceptionMessage();
        }
    }
}
