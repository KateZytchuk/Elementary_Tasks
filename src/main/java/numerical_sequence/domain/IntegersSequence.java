package numerical_sequence.domain;

import java.util.ArrayList;
import java.util.logging.Logger;

public class IntegersSequence extends NumericalSequences {
    private static ArrayList<Integer> integers = new ArrayList<Integer>();
    private static final Logger LOGGER = Logger.getLogger(IntegersSequence.class.getName());

    public IntegersSequence() {
        super();
    }

    public static void add(int number) {
        integers.add(number);
    }

    public static void print() {
        String result = "";
        for (int temp : integers) {
            result += Integer.toString(temp) + ",\t";
        }
        result += "\n";
        LOGGER.info(result);
    }
}