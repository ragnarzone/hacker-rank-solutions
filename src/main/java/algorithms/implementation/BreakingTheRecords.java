package algorithms.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BreakingTheRecords {
    // Solution
    public static List<Integer> breakingRecords(List<Integer> scores) {
        int highest = Integer.MIN_VALUE, least = Integer.MAX_VALUE,
                highestCount = -1, leastCount = -1;
        for(Integer current : scores){
            if (current > highest){
                highest = current;
                highestCount++;
            }
            if (current < least){
                least = current;
                leastCount++;
            }
        }
        return new ArrayList<Integer>(Arrays.asList(highestCount, leastCount));

    }
}
