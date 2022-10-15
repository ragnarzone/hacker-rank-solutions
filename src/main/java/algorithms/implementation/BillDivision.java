package algorithms.implementation;

import java.util.List;

public class BillDivision {
    // Solution
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int actual = (bill.stream().reduce(0, (sub, elem) -> sub+elem) - bill.get(k))/2;
        if(b - actual == 0){
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - actual);
        }
    }
}
