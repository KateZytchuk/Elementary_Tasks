import Envelopes.EnvelopeAnalysis;
import chessBoard.ChessOperations;

/**
 * Created by IntelliJ IDEA.
 * USER: zaets39
 * DATE: 17.10.2019
 * TIME: 13:06
 */

public class Program {
    public static void main(String[] args) {
        EnvelopeAnalysis.similizeEnvelopes();
        ChessOperations.getBoard();
    }

    static void showMenu(){
        System.out.println("Choose the program you want to execute:");
        System.out.println("1)Chess Board");
        System.out.println("2)Envelopes Analysis");
        System.out.println("3)Sorting of triangles");
        System.out.println("4)File parser");
        System.out.println("5)Number in words");
        System.out.println("6)Lucky tickets");
        System.out.println("7)Numeric sequence");
        System.out.println("8)Fibonacci series for range");
        System.out.println("9)Exponentiation");
        System.out.println("10)Storage");
    }
}
