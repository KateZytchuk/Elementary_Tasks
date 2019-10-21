package envelopes;

import validation.MyValidator;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Created by IntelliJ IDEA.
 * USER: zaets39
 * DATE: 17.10.2019
 * TIME: 13:09
 */

public class EnvelopeAnalysis {

    private static final Logger LOGGER = Logger.getLogger(EnvelopeAnalysis.class.getName());

    private static final  String FIRST_TO_SECOND  = "You can put your first envelope to second";
    private static final String SECOND_TO_FIRST = "You can put your second envelope to first";
    private static final String CANNOT_PUT = "You can`t put your one envelope to another";
    private static final String EQUAL_ENVELOPES = "Your envelopes are equal so, you can`t put one envelope to another";

    private EnvelopeAnalysis(){}

    public static void similizeEnvelopes() {
        String choice;
        Scanner in = new Scanner(System.in);
        do{
            inputDimensions();
            LOGGER.info("Would you like to continue?");
            choice = in.nextLine();
        }while(choice.equalsIgnoreCase("y")||choice.equalsIgnoreCase("yes"));
        in.close();
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
        double firstWidth;
        double firstLength;
        double secondWidth;
        double secondLength;
        int answer;
        try {
            Scanner in = new Scanner(System.in);
            LOGGER.info("Enter the width of first envelope:");
            firstWidth = Double.parseDouble(in.nextLine());
            LOGGER.info("Enter the length of first envelope:");
            firstLength = Double.parseDouble(in.nextLine());
            LOGGER.info("Enter the width of second envelope:");
            secondWidth = Double.parseDouble(in.nextLine());
            LOGGER.info("Enter the length of second envelope:");
            secondLength = Double.parseDouble(in.nextLine());
            in.close();
            Envelope first = new Envelope(firstWidth, firstLength);
            Envelope second = new Envelope(secondWidth, secondLength);
            answer = getAnalysis(first, second);
            switch (answer){
                case 0:
                    LOGGER.info(EQUAL_ENVELOPES);
                    break;
                case 1:
                    LOGGER.info(FIRST_TO_SECOND);
                    break;
                case 2:
                    LOGGER.info(SECOND_TO_FIRST);
                    break;
                case -1:
                    LOGGER.info(CANNOT_PUT);
                    break;
                default:
                    break;
            }
        } catch (Exception ex)
        {
            MyValidator.printExceptionMessage();
        }
    }
}
