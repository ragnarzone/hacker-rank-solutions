package algorithms.warmup;

import java.util.List;

public class AVeryBigSum {
    // Solution
    public static long aVeryBigSum(List<Long> ar) {
        long sum = ar.stream().mapToLong(Long::longValue).sum();
        return sum;
    }
}
