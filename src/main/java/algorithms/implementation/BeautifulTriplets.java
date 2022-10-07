package algorithms.implementation;

import java.util.List;

public class BeautifulTriplets {

    // Solution
    public static int beautifulTriplets(int d, List<Integer> arr) {
        int counter = 0;
        for(int i = 0; i < arr.size(); i++){
            if(arr.contains(arr.get(i)+d) && arr.contains(arr.get(i)+2*d)){
                counter++;
            }
        }
        return counter;
    }
}
