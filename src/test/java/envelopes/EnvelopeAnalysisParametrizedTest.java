package envelopes;

import envelopes.domain.Envelope;
import envelopes.services.Envelopes;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class EnvelopeAnalysisParametrizedTest {

    private Envelope first;
    private Envelope second;
    private boolean expected;

    public EnvelopeAnalysisParametrizedTest(Envelope first, Envelope second, boolean expected) {
        this.first = first;
        this.second = second;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: two Envelopes")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new Envelope(2.0, 2.2), new Envelope(10, 5), false},
                {new Envelope(4.0, 1.8), new Envelope(2.1, 4.9), false},
                {new Envelope(3.25, 3.5), new Envelope(3.0, 2.45), true},
                {new Envelope(3.0, 6.0), new Envelope(4.0, 2.0), true},
                {new Envelope(3.95, 2.85), new Envelope(3.95, 2.85), false},
                {new Envelope(5.8, 4.23), new Envelope(4.23, 5.2), false},
                {new Envelope(5.1, 6.0), new Envelope(5.2, 6.0), false},
                {new Envelope(10, 2), new Envelope(9, 9), false},
                {new Envelope(9, 9), new Envelope(10, 2), true},
                {new Envelope(8, 7), new Envelope(2, 10), false}
        });
    }

    @Test
    public void putEnvelope_Test() {
        assertEquals(expected, Envelopes.analyze(first, second));
    }
}