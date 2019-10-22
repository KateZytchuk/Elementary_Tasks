package envelopes;

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
        Envelope first = new Envelope(0, 0);
        Envelope second = new Envelope(0, 0);
        EnvelopeAnalysis.getAnalysis(first, second);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getAnalysisTwoZeroNumsTest()
    {
        Envelope first = new Envelope(0, 6);
        Envelope second = new Envelope(0, 5);
        EnvelopeAnalysis.getAnalysis(first, second);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getAnalysisThreeZeroNumsTest()
    {
        Envelope first = new Envelope(0, 0);
        Envelope second = new Envelope(0, 5);
        EnvelopeAnalysis.getAnalysis(first, second);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getAnalysisOneZeroNumTest()
    {
        Envelope first = new Envelope(0, 3);
        Envelope second = new Envelope(4, 5);
        EnvelopeAnalysis.getAnalysis(first, second);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getAnalysisOneNegativeNumTest()
    {
        Envelope first = new Envelope(-5, 8);
        Envelope second = new Envelope(42, 5);
        EnvelopeAnalysis.getAnalysis(first, second);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getAnalysisTwoNegativeNumsTest()
    {
        Envelope first = new Envelope(-8, -34);
        Envelope second = new Envelope(6, 25);
        EnvelopeAnalysis.getAnalysis(first, second);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getAnalysisThreeNegativeNumsTest()
    {
        Envelope first = new Envelope(-8, -34);
        Envelope second = new Envelope(6, -65);
        EnvelopeAnalysis.getAnalysis(first, second);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getAnalysisAllNegativeNumsTest()
    {
        Envelope first = new Envelope(-8, -34);
        Envelope second = new Envelope(-6, -12);
        EnvelopeAnalysis.getAnalysis(first, second);
    }
    @Test
    public void firstInSecondTest_1()
    {
        Envelope first = new Envelope(2.0, 2.2);
        Envelope second = new Envelope(3.0, 2.8);
        int actual =EnvelopeAnalysis.getAnalysis(first, second);
        assertEquals(1, actual);
    }
    @Test
    public void firstInSecondTest_2()
    {
        Envelope first = new Envelope(4.0, 1.8);
        Envelope second = new Envelope(2.1, 4.9);
        int actual =EnvelopeAnalysis.getAnalysis(first, second);
        assertEquals(1, actual);
    }
    @Test
    public void secondInFirstTest_1()
    {
        Envelope first = new Envelope(3.25, 3.5);
        Envelope second = new Envelope(3.0, 2.45);
        int actual =EnvelopeAnalysis.getAnalysis(first, second);
        assertEquals(2, actual);
    }
    @Test
    public void secondInFirstTest_2()
    {
        Envelope first = new Envelope(3.0, 6.0);
        Envelope second = new Envelope(4.0, 2.0);
        int actual =EnvelopeAnalysis.getAnalysis(first, second);
        assertEquals(2, actual);
    }
    @Test
    public void identicalEnvelopesTest_1()
    {
        Envelope first = new Envelope(3.95, 2.85);
        Envelope second = new Envelope(3.95, 2.85);
        int actual =EnvelopeAnalysis.getAnalysis(first, second);
        assertEquals(0, actual);
    }
    @Test
    public void identicalEnvelopesTest_2()
    {
        Envelope first = new Envelope(5.8, 4.23);
        Envelope second = new Envelope(4.23, 5.8);
        int actual =EnvelopeAnalysis.getAnalysis(first, second);
        assertEquals(0, actual);
    }

    @Test
    public void cannotBePutTest()
    {
        Envelope first = new Envelope(5.1, 6.0);
        Envelope second = new Envelope(5.2, 6.0);
        int actual =EnvelopeAnalysis.getAnalysis(first, second);
        assertEquals(-1, actual);
    }

    @Test
    public void diagonalTest()
    {
        Envelope first = new Envelope(10, 1);
        Envelope second = new Envelope(9, 9);
        int actual =EnvelopeAnalysis.getAnalysis(first, second);
        assertEquals(3, actual);
    }
    @Test
    public void diagonalTest_2()
    {
        Envelope first = new Envelope(9, 9);
        Envelope second = new Envelope(10, 1);
        int actual =EnvelopeAnalysis.getAnalysis(first, second);
        assertEquals(3, actual);
    }
    @Test
    public void diagonalTest_3()
    {
        Envelope first = new Envelope(1, 10);
        Envelope second = new Envelope(9, 9);
        int actual =EnvelopeAnalysis.getAnalysis(first, second);
        assertEquals(3, actual);
    }
    @Test
    public void diagonalTest_4()
    {
        Envelope first = new Envelope(9, 9);
        Envelope second = new Envelope(1, 10);
        int actual =EnvelopeAnalysis.getAnalysis(first, second);
        assertEquals(3, actual);
    }
    @Test
    public void diagonalTest_5()
    {
        Envelope first = new Envelope(8, 7);
        Envelope second = new Envelope(1, 10);
        int actual =EnvelopeAnalysis.getAnalysis(first, second);
        assertEquals(-1, actual);
    }
}