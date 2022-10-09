package algorithms.warmup;

import java.util.Arrays;
import java.util.List;

public class CompareTheTriplets {
    // Solution
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aPoints = 0;
        int bPoints = 0;
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i) > b.get(i)) aPoints++;
            if(a.get(i) < b.get(i)) bPoints++;
        }
        // List<Integer> result = new ArrayList<>();
        // result.add(aPoints);
        // result.add(bPoints);
        return Arrays.asList(aPoints, bPoints);
    }
}
