package extended;

import commons.NumberSeparator;
import commons.NumberSeparatorImpl;
import commons.NumeralsConverter;

import java.util.List;
import java.util.Map;

// flexible implementation
public class ExtendRomNumConverter implements NumeralsConverter {
    private String romanNumeral;
    private StringBuilder tempNumeral;
    private NumberSeparator splitter;
    private List<Integer> numberParts;
    private NumeralsMapper mapper;

    public String convert(int number) {
        splitter = new NumberSeparatorImpl();
        numberParts = splitter.separateNumber(number);
        tempNumeral = new StringBuilder();

        //loop is going backwards to provide the right order for roman numerals to occur in the final String
        for (int i = numberParts.size() - 1; i >= 0; i--) {
            String singleRomanNumeral = convertSingleNumeral(numberParts.get(i));

            tempNumeral.append(singleRomanNumeral);
        }

        romanNumeral = new String(tempNumeral);
        return romanNumeral;
    }

    private String convertSingleNumeral(int number) {
        mapper = new NumeralsMapper();

        Map<String, String> map = mapper.mapNumerals();

        String result;
        String numberAsString = String.valueOf(number);

        if (map.containsKey(numberAsString)) {
            result = map.get(numberAsString);
        } else {
            result = "";
        }

        return result;
    }
}
