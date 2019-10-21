package numerical_sequence;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by IntelliJ IDEA.
 * USER: zaets39
 * DATE: 20.10.2019
 * TIME: 19:18
 */

public class My_NumberTest {
    @Test
    public void twoInputTest() {
        int [] actual = My_Number.findNumbers(2);
        int [] expected = new int[]{1};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void twentyFiveInputTest() {
        int [] actual = My_Number.findNumbers(25);
        int [] expected = new int[]{1, 2, 3, 4, 5};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void thirtyThreeInputTest() {
        int [] actual = My_Number.findNumbers(33);
        int [] expected = new int[]{1, 2, 3, 4, 5};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void fiftyInputTest() {
        int [] actual = My_Number.findNumbers(50);
        int [] expected = new int[]{1, 2, 3, 4, 5, 6, 7};
        assertArrayEquals(expected, actual);
    }
}