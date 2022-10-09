package algorithms.warmup;

import java.util.List;

public class SimpleArraySum {
    // Solution
    public static int simpleArraySum(List<Integer> ar) {
        int result = 0;
        for (int i = 0; i < ar.size(); i++) {
            result += ar.get(i);
        }
        return result;
    }
}
