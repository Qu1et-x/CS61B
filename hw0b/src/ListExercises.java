import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    private static final Logger log = LoggerFactory.getLogger(ListExercises.class);

    /** Returns the total sum in a list of integers */
    public static int sum(List<Integer> L) {
        // TODO: Fill in this function.
        int total = 0;
        for (int i : L) {
            total += i;
        }
        return total;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        // TODO: Fill in this function.
        List<Integer> lst = new ArrayList<>();
        for (int i : L) {
            if (i % 2 == 0) {
                lst.add(i);
            }
        }
        return lst;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Fill in this function.
        List<Integer> lst = new ArrayList<>();
        if (L1 == null || L2 == null) return lst;
        for (int i : L1) {
            for (int j : L2) {
                if (!(lst.contains(i)) && i == j) {
                    lst.add(i);
                    break;
                }
            }
        }
        return lst;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        // TODO: Fill in this function.
        int times = 0;
        for (String i : words) {
            if (i == null) continue;
            for (int j = 0; j < i.length(); j++) {
                if (i.charAt(j) == c) {
                    times++;
                }
            }
        }
        return times;
    }
}
