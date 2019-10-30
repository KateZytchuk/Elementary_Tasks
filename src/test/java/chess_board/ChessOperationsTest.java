package chess_board;

import chess_board.domain.ChessDesk;
import chess_board.services.ChessOperations;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessOperationsTest {
    @Test (expected = NegativeArraySizeException.class)
    public void createChessDesc_allNegativeInputTest() {
        ChessDesk myDesk = new ChessDesk(-5, -8);
        ChessOperations.createChessDesc(myDesk);
    }
    @Test (expected = NegativeArraySizeException.class)
    public void createChessDesc_lengthNegativeInputTest() {
        ChessDesk myDesk = new ChessDesk(-52, 5);
        ChessOperations.createChessDesc(myDesk);
    }
    @Test (expected = NegativeArraySizeException.class)
    public void createChessDesc_widthNegativeInputTest() {
        ChessDesk myDesk = new ChessDesk(5, -9);
        ChessOperations.createChessDesc(myDesk);
    }
    @Test
    public void createChessDesc_oneLineTest() {
     ChessDesk myDesc = new ChessDesk(1, 6);
     char [][] expected = new char[1][6];
     expected[0][0]='*';
     expected[0][1]=' ';
     expected[0][2]='*';
     expected[0][3]=' ';
     expected[0][4]='*';
     expected[0][5]=' ';
     char[][] actual = ChessOperations.createChessDesc(myDesc);
     assertArrayEquals(expected, actual);
    }
    @Test
    public void createChessDesc_oneColumnTest() {
        ChessDesk myDesc = new ChessDesk(6, 1);
        char [][] expected = new char[6][1];
        expected[0][0]='*';
        expected[1][0]=' ';
        expected[2][0]='*';
        expected[3][0]=' ';
        expected[4][0]='*';
        expected[5][0]=' ';
        char[][] actual = ChessOperations.createChessDesc(myDesc);
        assertArrayEquals(expected, actual);
    }
    @Test
    public void createChessDesc_squareMatrixTest() {
        ChessDesk myDesc = new ChessDesk(3, 3);
        char [][] expected = new char[3][3];
        expected[0][0]='*';
        expected[0][1]=' ';
        expected[0][2]='*';
        expected[1][0]=' ';
        expected[1][1]='*';
        expected[1][2]=' ';
        expected[2][0]='*';
        expected[2][1]=' ';
        expected[2][2]='*';
        char[][] actual = ChessOperations.createChessDesc(myDesc);
        assertArrayEquals(expected, actual);
    }
    @Test
    public void createChessDesc_rectangleDeskTest_1() {
        ChessDesk myDesc = new ChessDesk(3, 4);
        char [][] expected = new char[3][4];
        expected[0][0]='*';
        expected[0][1]=' ';
        expected[0][2]='*';
        expected[0][3]=' ';
        expected[1][0]=' ';
        expected[1][1]='*';
        expected[1][2]=' ';
        expected[1][3]='*';
        expected[2][0]='*';
        expected[2][1]=' ';
        expected[2][2]='*';
        expected[2][3]=' ';
        char[][] actual = ChessOperations.createChessDesc(myDesc);
        assertArrayEquals(expected, actual);
    }
    @Test
    public void createChessDesc_rectangleDescTest_2() {
        ChessDesk myDesc = new ChessDesk(4, 3);
        char [][] expected = new char[4][3];
        expected[0][0]='*';
        expected[0][1]=' ';
        expected[0][2]='*';
        expected[1][0]=' ';
        expected[1][1]='*';
        expected[1][2]=' ';
        expected[2][0]='*';
        expected[2][1]=' ';
        expected[2][2]='*';
        expected[3][0]=' ';
        expected[3][1]='*';
        expected[3][2]=' ';
        char[][] actual = ChessOperations.createChessDesc(myDesc);
        assertArrayEquals(expected, actual);
    }
}