import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * USER: zaets39
 * DATE: 17.10.2019
 * TIME: 13:09
 */

public class EnvelopeAnalysis {

    public  static String getAnalysis(double firstWidth, double firstLength,
                                      double secondWidth, double secondLength)
                                    throws IllegalArgumentException{

        String result = "";

        if(firstWidth <= 0 || firstLength <= 0 || secondWidth <=0
                || secondLength <=0){
            throw  new IllegalArgumentException();
        }

        if((firstWidth == secondWidth) && (firstLength == secondLength)
            || (firstLength == secondWidth) && (firstWidth == secondLength)){
            result = "Your envelopes are equal so, you can`t put one envelope to another";
        }
        else  if (((firstWidth > secondWidth) && (firstLength > secondLength))
                ||((firstWidth > secondLength) && (firstLength > secondWidth))){
            result = "You can put your second envelope to first";
        }
        else if (((secondWidth > firstWidth) && (secondLength > firstLength)) ||
                ((secondWidth > firstLength)&&(secondLength > firstWidth))){
            result = "You can put your first envelope to second";
        }
        else{
            result = "You can`t put your one envelope to another";
        }
        return result;
    }
    public static void inputDementions()
    {
        double firstWidth, firstLength, secondWidth, secondLength;
        String answer;
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter the width of first envelope: ");
            firstWidth = Double.parseDouble(in.nextLine());
            System.out.println("Enter the length of first envelope: ");
            firstLength = Double.parseDouble(in.nextLine());
            System.out.println("Enter the width of second envelope: ");
            secondWidth = Double.parseDouble(in.nextLine());
            System.out.println("Enter the length of second envelope: ");
            secondLength = Double.parseDouble(in.nextLine());
            answer = getAnalysis(firstWidth, firstLength, secondWidth, secondLength);
            System.out.println(answer);
        } catch (Exception ex)
        {
            //TODO;
        }
    }
}
