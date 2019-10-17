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
    public void getAnalysisAllZeroNumsTest()
    {
        double [] allZeroCheck = new double[] {0, 0, 0, 0};
        EnvelopeAnalysis.getAnalysis(allZeroCheck);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getAnalysisTwoZeroNumsTest()
    {
        double [] twoZeroCheck = new double[] {0, 6, 0, 5};
        EnvelopeAnalysis.getAnalysis(twoZeroCheck);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getAnalysisThreeZeroNumsTest()
    {
        double [] threeZeroCheck = new double[] {0, 0, 0, 5};
        EnvelopeAnalysis.getAnalysis(threeZeroCheck);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getAnalysisOneZeroNumTest()
    {
        double [] oneZeroCheck = new double[] {0, 3, 4, 5};
        EnvelopeAnalysis.getAnalysis(oneZeroCheck);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getAnalysisOneNegativeNumTest()
    {
        double [] oneNegativeCheck = new double[] {-5, 8, 42, 5};
        EnvelopeAnalysis.getAnalysis(oneNegativeCheck);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getAnalysisTwoNegativeNumsTest()
    {
        double [] twoNegativeCheck = new double[] {-8, -34, 6, 25};
        EnvelopeAnalysis.getAnalysis(twoNegativeCheck);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getAnalysisThreeNegativeNumsTest()
    {
        double [] threeNegativeCheck = new double[] {-8, -34, 6, -65};
        EnvelopeAnalysis.getAnalysis(threeNegativeCheck);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getAnalysisAllNegativeNumsTest()
    {
        double [] allNegativeCheck = new double[] {-8, -34, -6, -12};
        EnvelopeAnalysis.getAnalysis(allNegativeCheck);
    }


}