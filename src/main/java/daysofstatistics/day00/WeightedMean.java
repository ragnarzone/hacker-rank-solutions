package daysofstatistics.day00;

import java.util.List;

public class WeightedMean {
    public static void weightedMean(List<Integer> X, List<Integer> W) {
        int total = 0;
        int totalWeights = 0;
        for(int i = 0; i < X.size(); i++){
            total += X.get(i) * W.get(i);
            totalWeights += W.get(i);
        }
        double weightedMean = (double) total/totalWeights;
        System.out.printf("%.1f", weightedMean);
    }
}
