package commons;

import java.util.ArrayList;
import java.util.List;

public class NumberSeparatorImpl implements NumberSeparator {

    // this method is separating number - it get unit/ decimal/ hundred etc. part of number and store it in the list
    public List<Integer> separateNumber(int number) {

        int partOfNumber = 1;
        List<Integer> numberParts = new ArrayList<Integer>();

        if (number == 0) {
            numberParts.add(0);
        }
        while (number > 0) {
            int temp = (number % 10) * partOfNumber;
            number /= 10;
            numberParts.add(new Integer(temp));
            partOfNumber *= 10;
        }

        return numberParts;
    }
}
