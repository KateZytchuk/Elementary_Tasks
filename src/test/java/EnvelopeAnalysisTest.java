import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by IntelliJ IDEA.
 * USER: zaets39
 * DATE: 17.10.2019
 * TIME: 13:18
 */

public class EnvelopeAnalysisTest {
    @Test(expected = IllegalArgumentException.class)
    public void getAnalysisAllZeroDataTest()
    {
        double [] allZeroCheck = new double[] {0, 0, 0, 0};
        EnvelopeAnalysis.getAnalysis(allZeroCheck);
    }
    @Test(expected = IllegalArgumentException.class)
    public void getAnalysisTwoZeroDataTest()
    {
        double [] twoZeroCheck = new double[] {0, 6, 0, 5};
        EnvelopeAnalysis.getAnalysis(twoZeroCheck);
    }
    @Test(expected = IllegalArgumentException.class)
    public void getAnalysisThreeZeroDataTest()
    {
        double [] threeZeroCheck = new double[] {0, 0, 0, 5};
        EnvelopeAnalysis.getAnalysis(threeZeroCheck);
    }
    @Test(expected = IllegalArgumentException.class)
    public void getAnalysisOneZeroDataTest()
    {
        double [] oneZeroCheck = new double[] {0, 3, 4, 5};
        EnvelopeAnalysis.getAnalysis(oneZeroCheck);
    }
}