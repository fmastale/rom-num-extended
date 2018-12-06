package extended;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class NumeralsMapperTest {
    @Test
    public void checkIfMappingProperly () {
        NumeralsMapper mapper = new NumeralsMapper();

        Map<String, String> actual = mapper.mapNumerals();

        Map<String, String> expected = new HashMap<String, String>();
        expected.put("40", "XL");

        assertEquals(expected.get(40), actual.get(40));
    }
}