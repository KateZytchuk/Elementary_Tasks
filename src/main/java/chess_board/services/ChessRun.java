package chess_board.services;

import chess_board.domain.ChessDesk;
import common.output.Constants;
import common.output.OutputInfo;

import java.util.Scanner;

public class ChessRun {
    public void run(){
        String choice;
        Scanner in = new Scanner(System.in);
        ChessDesk desc;
        do {
            desc = ChessOperations.inputSize();
            char[][] resultBoard = ChessOperations.createChessDesc(desc);
            String result = ChessOperations.createStringFromBoard(resultBoard);
            OutputInfo.showMessage(result);
            OutputInfo.showMessage(Constants.QUESTION_TO_USER);
            choice = in.nextLine();
        } while (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes"));
    }
}
