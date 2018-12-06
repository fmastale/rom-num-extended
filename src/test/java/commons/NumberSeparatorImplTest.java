package commons;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class NumberSeparatorImplTest {
    @Test
    public void checkIfSeparatesProperly() {
        NumberSeparator separator = new NumberSeparatorImpl();
        List<Integer> actual = separator.separateNumber(123);

        List<Integer> expected = new ArrayList<Integer>();
        expected.add(3);
        expected.add(20);
        expected.add(100);

        Collections.sort(actual);
        Collections.sort(expected);

        assertEquals(actual, expected);
    }

    @Test
    public void checkIfContainsZero() {
        NumberSeparator separator = new NumberSeparatorImpl();
        List<Integer> actual = separator.separateNumber(0);

        List<Integer> expected = new ArrayList<Integer>();
        expected.add(0);

        assertEquals(actual, expected);
    }

    @Test
    public void checkIfListsAreNotEquals() {
        NumberSeparator separator = new NumberSeparatorImpl();
        List<Integer> actual = separator.separateNumber(33);

        List<Integer> expected = new ArrayList<Integer>();
        expected.add(4);
        expected.add(20);

        Collections.sort(actual);
        Collections.sort(expected);

        assertNotEquals(actual, expected);
    }

}