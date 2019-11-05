package envelopes;

import envelopes.domain.Envelope;
import envelopes.services.Envelopes;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class EnvelopeAnalysisParametrizedTest {

    private ArrayList<Envelope>envelopesList;
    private String expected;

    public EnvelopeAnalysisParametrizedTest(ArrayList<Envelope> envelopesList, String expected) {
        this.envelopesList = envelopesList;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}")
    public static Collection<Object[]> data() {

        return Arrays.asList(new Object[][]{
                {TestData.getThreeEnvelopes(), TestData.threeEnvelopesStr},
                {TestData.getTwoEnvelopes(), TestData.twoEnvelopesStr},
                {TestData.getTenEnvelopes(), TestData.tenEnvelopesStr}
        });
    }

    @Test
    public void putEnvelope_Test() {
       assertEquals(expected, Envelopes.compare(envelopesList));
    }
}