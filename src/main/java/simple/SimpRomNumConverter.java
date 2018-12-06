package simple;

import commons.NumberSeparator;
import commons.NumberSeparatorImpl;
import commons.NumeralsConverter;

import java.util.List;

// fixed implementation
public class SimpRomNumConverter implements NumeralsConverter {
    private String romanNumeral;
    private NumberSeparator splitter;
    private StringBuilder tempNumeral;
    private List<Integer> numberParts;


    public String convert(int number) {
        splitter = new NumberSeparatorImpl();
        tempNumeral = new StringBuilder();
        numberParts = splitter.separateNumber(number);

        //loop is going backwards to provide the right order for roman numerals to occur in the final String
        for (int i = numberParts.size() - 1; i >= 0; i--) {
            String singleRomanNumeral = convertSingleNumeral(numberParts.get(i));

            tempNumeral.append(singleRomanNumeral);
        }

        romanNumeral = new String(tempNumeral);
        return romanNumeral;
    }

    private String convertSingleNumeral(int number) {
        if (number > 0 && number <= 3000) {
            if (number == 1) {
                return "I";
            }
            if (number == 2) {
                return "II";
            }
            if (number == 3) {
                return "III";
            }
            if (number == 4) {
                return "IV";
            }
            if (number == 5) {
                return "V";
            }
            if (number == 6) {
                return "VI";
            }
            if (number == 7) {
                return "VII";
            }
            if (number == 8) {
                return "VIII";
            }
            if (number == 9) {
                return "IX";
            }
            if (number == 10) {
                return "X";
            }
            if (number == 20) {
                return "XX";
            }
            if (number == 30) {
                return "XXX";
            }
            if (number == 40) {
                return "XL";
            }
            if (number == 50) {
                return "L";
            }
            if (number == 60) {
                return "LX";
            }
            if (number == 70) {
                return "LXX";
            }
            if (number == 80) {
                return "LXXX";
            }
            if (number == 90) {
                return "XC";
            }
            if (number == 100) {
                return "C";
            }
            if (number == 200) {
                return "CC";
            }
            if (number == 300) {
                return "CCC";
            }
            if (number == 400) {
                return "CD";
            }
            if (number == 500) {
                return "D";
            }
            if (number == 600) {
                return "DC";
            }
            if (number == 700) {
                return "DCC";
            }
            if (number == 800) {
                return "DCCC";
            }
            if (number == 900) {
                return "CM";
            }
            if (number == 1000) {
                return "M";
            }
            if (number == 1500) {
                return "MD";
            }
            if (number == 2000) {
                return "MM";
            }
            if (number == 3000) {
                return "MMM";
            }
        }
        if (number == 0) {
            return "";
        } else {
            return "Supported numbers are between 1 and 3999";
        }
    }
}
