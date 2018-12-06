package extended;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExtendRomNumConverterTest {
    @Test
    public void checkIfWorkProperly() {
        ExtendRomNumConverter converter = new ExtendRomNumConverter();

        String actual = converter.convert(1504);
        String expect = "MDIV";

        assertEquals("should be MDIV", expect, actual);
    }

}