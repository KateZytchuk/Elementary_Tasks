package chess_board.services;

import chess_board.domain.ChessDesk;
import chess_board.validation.ChessDeskValidator;
import common.input.InputNumbers;
import common.output.Constants;


public class ChessOperations {

    private ChessOperations() {
    }

    public static ChessDesk inputSize() {
        String[] inputStr;
        int length = 0;
        int width = 0;
        boolean flag;
        do {
            inputStr = InputNumbers.inputDimensions(Constants.ENTER_DIMENSION);
            flag = ChessDeskValidator.validateDimensions(inputStr);
            if (flag) {
                length = Integer.parseInt(inputStr[0]);
                width = Integer.parseInt(inputStr[1]);
            }
        } while (length <= 0 | width <= 0);
        return new ChessDesk(width, length);
    }

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

    public static String createStringFromBoard(char[][] desk) {
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