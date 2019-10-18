import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by IntelliJ IDEA.
 * USER: zaets39
 * DATE: 17.10.2019
 * TIME: 13:18
 */

public class EnvelopeAnalysisTest {

    private final String FIRST_TO_SECOND  = "You can put your first envelope to second";
    private final String SECOND_TO_FIRST = "You can put your second envelope to first";
    private final String CANNOT_PUT = "You can`t put your one envelope to another";
    private final String EQUAL_ENVELOPES = "Your envelopes are equal so, you can`t put one envelope to another";

    @Test(expected = IllegalArgumentException.class)
    public void getAnalysisAllZeroNumsTest()
    {
        EnvelopeAnalysis.getAnalysis(0, 0, 0, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getAnalysisTwoZeroNumsTest()
    {
        EnvelopeAnalysis.getAnalysis(0, 6, 0, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getAnalysisThreeZeroNumsTest()
    {
        EnvelopeAnalysis.getAnalysis(0, 0, 0, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getAnalysisOneZeroNumTest()
    {
        EnvelopeAnalysis.getAnalysis(0, 3, 4, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getAnalysisOneNegativeNumTest()
    {
        EnvelopeAnalysis.getAnalysis(-5, 8, 42, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getAnalysisTwoNegativeNumsTest()
    {
        EnvelopeAnalysis.getAnalysis(-8, -34, 6, 25);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getAnalysisThreeNegativeNumsTest()
    {
        EnvelopeAnalysis.getAnalysis(-8, -34, 6, -65);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getAnalysisAllNegativeNumsTest()
    {
        EnvelopeAnalysis.getAnalysis(-8, -34, -6, -12);
    }
    @Test
    public void firstInSecondTest_1()
    {
        String  actual = EnvelopeAnalysis.getAnalysis(2.0, 2.2, 3.0, 2.8);
        assertEquals(FIRST_TO_SECOND, actual);
    }
    @Test
    public void firstInSecondTest_2()
    {
        String  actual = EnvelopeAnalysis.getAnalysis(4.0, 1.8, 2.1, 4.9);
        assertEquals(FIRST_TO_SECOND, actual);
    }
    @Test
    public void secondInFirstTest_1()
    {
        String  actual = EnvelopeAnalysis.getAnalysis(3.25, 3.5, 3.0, 2.45);
        assertEquals(SECOND_TO_FIRST, actual);
    }
    @Test
    public void secondInFirstTest_2()
    {
        String  actual = EnvelopeAnalysis.getAnalysis(3.0, 6.0, 4.0, 2.0);
        assertEquals(SECOND_TO_FIRST, actual);
    }
    @Test
    public void identicalEnvelopesTest_1()
    {
        String  actual = EnvelopeAnalysis.getAnalysis(3.95, 2.85, 3.95, 2.85);
        assertEquals(EQUAL_ENVELOPES, actual);
    }
    @Test
    public void identicalEnvelopesTest_2()
    {
        String  actual = EnvelopeAnalysis.getAnalysis(5.8, 4.23, 4.23, 5.8);
        assertEquals(EQUAL_ENVELOPES, actual);
    }
    @Test
    public void cannotBePutTest()
    {
        String  actual = EnvelopeAnalysis.getAnalysis(5.1, 6.0, 5.2, 6.0);
        assertEquals(CANNOT_PUT, actual);
    }
}