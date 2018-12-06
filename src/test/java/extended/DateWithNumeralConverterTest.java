package extended;

import org.junit.Test;

import static org.junit.Assert.*;

public class DateWithNumeralConverterTest {
    @Test
    public void checkIfConvertsMonthProperly() {
        DateWithNumeralConverter generator = new DateWithNumeralConverter();

        String actual = generator.convertMonth(1, 10, 2019);
        String expected = "1/X/2019";

        assertEquals("Should be '1/X/2019'", expected, actual);
    }

    @Test
    public void checkIfMonthIsDifferent () {
        DateWithNumeralConverter generator = new DateWithNumeralConverter();

        String actual = generator.convertMonth(23, 9, 2000);
        String expected = "1/X/2019";

        assertNotEquals("Should be different than '23/IX/2000'", expected, actual);
    }

    @Test
    public void checkIfConvertsDateProperly() {
        DateWithNumeralConverter generator = new DateWithNumeralConverter();

        String actual = generator.convertDate(10, 11, 1999);
        String expected = "X-XI-MCMXCIX";

        assertEquals("Should be 'X-XI-MCMXCIX'", expected, actual);
    }

    @Test
    public void checkIfDateIsDifferent () {
        DateWithNumeralConverter generator = new DateWithNumeralConverter();

        String actual = generator.convertDate(1, 1, 2000);
        String expected = "X-I-MM";

        assertNotEquals("Should be different than 'I-I-MM'", expected, actual);
    }

}