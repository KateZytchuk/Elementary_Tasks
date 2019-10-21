import Envelopes.EnvelopeAnalysis;
import NumericalSequence.My_Number;
import Validation.My_Validator;
import chessBoard.ChessOperations;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * USER: zaets39
 * DATE: 17.10.2019
 * TIME: 13:06
 */

public class Program {

    public static void main(String[] args) {
        String choice;
        Scanner in = new Scanner(System.in);
        do{
            showMenu();
            System.out.println("Would you like to continue?");
            choice = in.nextLine();
        }while(choice.equalsIgnoreCase("y")||choice.equalsIgnoreCase("yes"));
        in.close();
    }

    static void showMenu(){
        Scanner in = new Scanner(System.in);
        int number;
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
        try{
            number =  Integer.parseInt(in.nextLine());
            startChosenProgram(number);
        }
        catch (Exception ex)
        {
            My_Validator.printExceptionMessage();
        }
    }
    static void startChosenProgram(int number)
    {
        switch (number){
            case 1:
                ChessOperations.getBoard();
                break;
            case 2:
                EnvelopeAnalysis.similizeEnvelopes();
                break;
            case 3:
                showMessage();
                break;
            case 4:
                showMessage();
                break;
            case 5:
                showMessage();
                break;
            case 6:
                showMessage();
                break;
            case 7:
                My_Number.inputNumber();
                break;
            case 8:
                showMessage();
                break;
            case 9:
                showMessage();
                break;
            case 10:
                showMessage();
                break;
            default:
                My_Validator.printExceptionMessage();
                break;
        }
    }
    static void showMessage()
    {
        System.out.println("Sorry, not implemented yet:(");
    }
}
