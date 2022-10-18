package daysofstatistics.day01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InterquartileRange {
    public static void interQuartile(List<Integer> values, List<Integer> freqs) {
        // Populate array
        List<Integer> expandedArray = new ArrayList<>();
        for (int i = 0; i < values.size(); i++) {
            for(int j = 0; j < freqs.get(i); j++){
                expandedArray.add(values.get(i));
            }
        }
        Collections.sort(expandedArray);

        // calculate Qs
        int size = expandedArray.size();
        double q1 = findQ(expandedArray.subList(0, size/2));
        double q3 = findQ(expandedArray.subList(size/2 + size%2, size));
        System.out.println(q3-q1);

    }
    private static int findQ(List<Integer> arr){
        int q;
        if(arr.size()%2 == 0){
            q = (arr.get(arr.size()/2-1) + arr.get(arr.size()/2))/2;
        } else {
            q = arr.get(arr.size()/2);
        }
        return q;
    }
}
