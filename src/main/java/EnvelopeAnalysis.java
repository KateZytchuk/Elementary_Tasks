import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * USER: zaets39
 * DATE: 17.10.2019
 * TIME: 13:09
 */

public class EnvelopeAnalysis {

    private final static String FIRST_TO_SECOND  = "You can put your first envelope to second";
    private final static String SECOND_TO_FIRST = "You can put your second envelope to first";
    private final static String CANNOT_PUT = "You can`t put your one envelope to another";
    private final static  String EQUAL_ENVELOPES = "Your envelopes are equal so, you can`t put one envelope to another";

    public static void similizeEnvelopes() {
        String choice;
        Scanner in = new Scanner(System.in);
        do{
            inputDimensions();
            System.out.println("Would you like to continue?");
            choice = in.nextLine();
        }while(choice.equalsIgnoreCase("y")||choice.equalsIgnoreCase("yes"));
    }

    public static int getAnalysis(Envelope first, Envelope second)
                                    throws IllegalArgumentException{

        int result;

        if(first.getWidth() <= 0 || first.getLength() <= 0
                || second.getWidth() <=0 || second.getLength() <=0){
            throw  new IllegalArgumentException();
        }

        if((first.getWidth() == second.getWidth()) && (first.getLength() == second.getLength())
            || (first.getLength() == second.getWidth()) && (first.getWidth() == second.getLength())){
            result = 0;
        }
        else  if (((first.getWidth() > second.getWidth()) && (first.getLength() > second.getLength()))
                ||((first.getWidth() > second.getLength()) && (first.getLength() > second.getWidth()))){
            result = 2;
        }
        else if (((second.getWidth() > first.getWidth()) && (second.getLength() > first.getLength())) ||
                ((second.getWidth() > first.getLength())&&(second.getLength() > first.getWidth()))){
            result = 1;
        }
        else{
            result = -1;
        }
        return result;
    }
    public static void inputDimensions()
    {
        double firstWidth, firstLength, secondWidth, secondLength;
        int answer;
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the width of first envelope:");
            firstWidth = Double.parseDouble(in.nextLine());
            System.out.println("Enter the length of first envelope:");
            firstLength = Double.parseDouble(in.nextLine());
            System.out.println("Enter the width of second envelope:");
            secondWidth = Double.parseDouble(in.nextLine());
            System.out.println("Enter the length of second envelope:");
            secondLength = Double.parseDouble(in.nextLine());
            in.close();
            Envelope first = new Envelope(firstWidth, firstLength);
            Envelope second = new Envelope(secondWidth, secondLength);
            answer = getAnalysis(first, second);
            switch (answer){
                case 0:
                    System.out.println(EQUAL_ENVELOPES);
                    break;
                case 1:
                    System.out.println(FIRST_TO_SECOND);
                    break;
                case 2:
                    System.out.println(SECOND_TO_FIRST);
                    break;
                case -1:
                    System.out.println(CANNOT_PUT);
                    break;
            }
        } catch (Exception ex)
        {
            System.out.println("Not a number!");
        }
    }
}
