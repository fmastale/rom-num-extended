package extended;

import java.io.*;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class NumeralsMapper {
    private InputStream input;
    private Properties properties;
    private Map<String, String> mappedNumerals;

    public Map<String, String> mapNumerals() {
        properties = new Properties();
        input = null;
        mappedNumerals = new HashMap<String, String>();

        try {
            // you can try to switch between uppercase ('numerals-big.properties')
            // and lowercase ('numerals-small.properties') letters
            String filename = "numerals-big.properties";

            input = new FileInputStream(filename);
            if (input == null) {
                System.out.println("Can't find file with properties " + filename);
                return null;
            }
            properties.load(input);

        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException exception) {
                    exception.printStackTrace();
                }
            }
        }

        mapConfigWithNumerals();

        return mappedNumerals;
    }

    private void mapConfigWithNumerals() {
        Enumeration<?> e = properties.propertyNames();

        while (e.hasMoreElements()) {
            String key = (String) e.nextElement();
            String value = properties.getProperty(key);

            mappedNumerals.put(key, value);
        }
    }
}

