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
    public static void clear(){
        integers.clear();
    }

    public static void print() {
        StringBuilder result = new StringBuilder();
        for (int temp : integers) {
            result.append(temp).append(" ");
        }
        String str = result.toString();
        LOGGER.info(str);
    }
}