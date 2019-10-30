package envelopes;

import envelopes.console.Constants;
import envelopes.domain.Envelope;
import envelopes.services.EnvelopeAnalysis;
import org.junit.Test;
import static org.junit.Assert.*;

public class EnvelopeAnalysisTest {


   @Test
    public void firstInSecondTest_1()
    {
        Envelope first = new Envelope(2.0, 2.2);
        Envelope second = new Envelope(3.0, 2.8);
        String  actual =EnvelopeAnalysis.analyze(first, second);
        assertEquals(Constants.FIRST_TO_SECOND, actual);
    }
    @Test
    public void firstInSecondTest_2()
    {
        Envelope first = new Envelope(4.0, 1.8);
        Envelope second = new Envelope(2.1, 4.9);
        String actual =EnvelopeAnalysis.analyze(first, second);
        assertEquals(Constants.FIRST_TO_SECOND, actual);
    }
    @Test
    public void secondInFirstTest_1()
    {
        Envelope first = new Envelope(3.25, 3.5);
        Envelope second = new Envelope(3.0, 2.45);
        String  actual =EnvelopeAnalysis.analyze(first, second);
        assertEquals(Constants.SECOND_TO_FIRST, actual);
    }
    @Test
    public void secondInFirstTest_2()
    {
        Envelope first = new Envelope(3.0, 6.0);
        Envelope second = new Envelope(4.0, 2.0);
        String  actual =EnvelopeAnalysis.analyze(first, second);
        assertEquals(Constants.SECOND_TO_FIRST, actual);
    }
    @Test
    public void identicalEnvelopesTest_1()
    {
        Envelope first = new Envelope(3.95, 2.85);
        Envelope second = new Envelope(3.95, 2.85);
        String actual =EnvelopeAnalysis.analyze(first, second);
        assertEquals(Constants.EQUAL_ENVELOPES, actual);
    }
    @Test
    public void identicalEnvelopesTest_2()
    {
        Envelope first = new Envelope(5.8, 4.23);
        Envelope second = new Envelope(4.23, 5.8);
        String  actual =EnvelopeAnalysis.analyze(first, second);
        assertEquals(Constants.EQUAL_ENVELOPES, actual);
    }

    @Test
    public void cannotBePutTest()
    {
        Envelope first = new Envelope(5.1, 6.0);
        Envelope second = new Envelope(5.2, 6.0);
        String actual =EnvelopeAnalysis.analyze(first, second);
        assertEquals(Constants.CANNOT_PUT, actual);
    }

    @Test
    public void diagonalTest()
    {
        Envelope first = new Envelope(10, 1);
        Envelope second = new Envelope(9, 9);
        String actual =EnvelopeAnalysis.analyze(first, second);
        assertEquals(Constants.DIAGONAL_ARRANGEMENT, actual);
    }
    @Test
    public void diagonalTest_2()
    {
        Envelope first = new Envelope(9, 9);
        Envelope second = new Envelope(10, 1);
        String  actual =EnvelopeAnalysis.analyze(first, second);
        assertEquals(Constants.DIAGONAL_ARRANGEMENT, actual);
    }
    @Test
    public void diagonalTest_3()
    {
        Envelope first = new Envelope(1, 10);
        Envelope second = new Envelope(9, 9);
        String actual =EnvelopeAnalysis.analyze(first, second);
        assertEquals(Constants.DIAGONAL_ARRANGEMENT, actual);
    }
    @Test
    public void diagonalTest_4()
    {
        Envelope first = new Envelope(10, 10);
        Envelope second = new Envelope(1, 13);
        String  actual = EnvelopeAnalysis.analyze(first, second);
        assertEquals(Constants.DIAGONAL_ARRANGEMENT, actual);
    }
    @Test
    public void diagonalTest_5()
    {
        Envelope first = new Envelope(8, 7);
        Envelope second = new Envelope(1, 10);
        String  actual =EnvelopeAnalysis.analyze(first, second);
        assertEquals(Constants.CANNOT_PUT, actual);
    }
}