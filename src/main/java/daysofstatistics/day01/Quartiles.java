package daysofstatistics.day01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Quartiles {
    public static List<Integer> quartiles(List<Integer> arr) {
        Collections.sort(arr);
        List<Integer> out = new ArrayList<>();
        out.add(findQ(arr.subList(0, arr.size()/2)));
        out.add(findQ(arr.subList(0, arr.size())));
        out.add(findQ(arr.subList(arr.size()/2 + arr.size()%2, arr.size())));
        return out;

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
