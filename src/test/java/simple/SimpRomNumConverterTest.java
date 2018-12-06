package simple;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimpRomNumConverterTest {
    @Test
    public void checkIfConvertProperly () {
        SimpRomNumConverter converter = new SimpRomNumConverter();

        int number = 1234;

        String expected = "MCCXXXIV";
        String actual = converter.convert(number);

        assertEquals("Should be MCCXXXIV", expected, actual);
    }

    @Test
    public void checkIfDifferent () {
        SimpRomNumConverter converter = new SimpRomNumConverter();

        int number = 1504;

        String expected = "MDX";
        String actual = converter.convert(number);

        assertNotEquals("Numerals shouldn't be equals", expected, actual);
    }

    @Test
    public void checkIfZero () {
        SimpRomNumConverter converter = new SimpRomNumConverter();

        int number = 0;

        String expected = "";
        String actual = converter.convert(number);

        assertEquals("Should be empty", expected, actual);
    }

    @Test
    public void chceckWhatIfOutOfRange () {
        SimpRomNumConverter converter = new SimpRomNumConverter();

        int number = 4000;

        String expected = "Supported numbers are between 1 and 3999";
        String actual = converter.convert(number);

        assertEquals("Should be \"Supported numbers are between 1 and 3999\"", expected, actual);
    }
}