package extended;

import commons.NumeralsConverter;

public class DateWithNumeralConverter {
    private String date;
    private StringBuilder tempDate;
    private NumeralsConverter converter;

    public String convertMonth(int day, int month, int year) {

        tempDate  = new StringBuilder();
        converter = new ExtendRomNumConverter();

        tempDate.append(day).append("/").
                 append(converter.convert(month)).append("/").
                 append(year);

        date = new String(tempDate);
        return date;
    }

    public String convertDate(int day, int month, int year) {
        tempDate  = new StringBuilder();
        converter = new ExtendRomNumConverter();

        tempDate.append(converter.convert(day)).append("-").
                 append(converter.convert(month)).append("-").
                 append(converter.convert(year));

        date = new String(tempDate);
        return date;
    }
}
