package algorithms.implementation;

import java.util.List;

public class AppleAndOrange {
    // Solution
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int fallenApples = 0, fallenOranges = 0;
        for (int i = 0; i < apples.size(); i++) {
            if (apples.get(i) + a >= s
                    && apples.get(i) + a <= t){
                fallenApples++;
            }
        }
        for (int i = 0; i < oranges.size(); i++) {
            if (oranges.get(i) + b <= t
                    && oranges.get(i) + b >= s){
                fallenOranges++;
            }
        }
        System.out.println(fallenApples);
        System.out.println(fallenOranges);
    }
}
