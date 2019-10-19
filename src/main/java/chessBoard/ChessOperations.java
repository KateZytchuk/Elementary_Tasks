package chessBoard;
import Validation.My_Validator;

/**
 * Created by IntelliJ IDEA.
 * USER: zaets39
 * DATE: 19.10.2019
 * TIME: 15:12
 */

public class ChessOperations
{
    public static void createChessDesc(ChessDesk desk){
        My_Validator.validateChessDimentions(desk.getLength(), desk.getWidth());
        int length = desk.getLength();
        int width = desk.getWidth();
        char [][] board = new char [length][width];
        for(int i=0; i<length; i++){
            for(int j=0; j<width; j++){
                if((i+j)%2==0){
                    board[i][j]=42;
                }
                else {
                    board[i][j]=32;
                }
            }
        }
        printChessDesc(board);
    }
     static void printChessDesc(char [][] desc)
    {
        for(int i=0; i<desc.length; i++){
            for (int j=0; j<desc[i].length; j++) {
                System.out.print(desc[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
