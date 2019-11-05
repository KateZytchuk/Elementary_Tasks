package chess_board.services;

import chess_board.console.InfoForUser;
import chess_board.console.OutputData;
import chess_board.domain.ChessDesk;
import common.inputData.InputInteger;
//import common.output.QuestionsToUser;

import java.util.Scanner;

public class ChessOperations {

    private ChessOperations() {
    }

   /* public static void getBoard() {
        String choice;
        Scanner in = new Scanner(System.in);
        ChessDesk temp;
        do {
            temp = inputSize();
            char[][] resultBoard = createChessDesc(temp);
            String result = createStringFromBoard(resultBoard);
            OutputData.printDesk(result);
            //QuestionsToUser.continueWork();
            choice = in.nextLine();
        } while (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes"));
        in.close();
    }*/

   /* private static ChessDesk inputSize() {
        InfoForUser.askForFirstDimension();
       // int length = InputInteger.inputData();
        InfoForUser.askForSecondDimension();
      //  int width = InputInteger.inputData();
        //return new ChessDesk(length, width);
    }*/

    public static char[][] createChessDesc(ChessDesk desk) {
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
        return board;
    }

    private static String createStringFromBoard(char[][] desk) {
        StringBuilder builder = new StringBuilder();
        builder.append("\n");
        int rows = desk.length;
        int columns = desk[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                builder.append(desk[i][j]).append("\t");
            }
            builder.append("\n");
        }
        return builder.toString();
    }
}