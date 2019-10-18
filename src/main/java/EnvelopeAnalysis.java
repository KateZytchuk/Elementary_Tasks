/**
 * Created by IntelliJ IDEA.
 * USER: zaets39
 * DATE: 17.10.2019
 * TIME: 13:09
 */

public class EnvelopeAnalysis {

    public  static String getAnalysis(double firstWidth, double firstLength,
                                      double secondWidth, double secondLength){
        String result = "";
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

}
