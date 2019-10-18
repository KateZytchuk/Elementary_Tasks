/**
 * Created by IntelliJ IDEA.
 * USER: zaets39
 * DATE: 17.10.2019
 * TIME: 13:09
 */

public class EnvelopeAnalysis {

    public  static String getAnalysis(double firstWidth, double firstLength,
                                      double secondWidth, double secondLength) {
        String result = "";
        if((firstWidth == secondWidth) || (firstLength == secondLength)
            || (firstLength == secondWidth) || (firstWidth == secondLength)){
            result = "You can`t put one envelope to another";
        }
        
        return result;
    }

}
