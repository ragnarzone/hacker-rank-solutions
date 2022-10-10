package algorithms.search;

import java.util.Arrays;
import java.util.List;

public class IceCreamParlor {
    // Solution
    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
        for(int i = 0; i < arr.size(); i++){
            for (int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) == m){
                    return Arrays.asList(i+1,j+1);
                }
            }
        }
        return null;
    }
}
