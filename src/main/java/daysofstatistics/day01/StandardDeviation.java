package daysofstatistics.day01;

import java.util.List;

public class StandardDeviation {
    public static void stdDev(List<Integer> arr) {

        double deviation = 0;
        double variance = 0;
        double mean = 0;
        double total = 0;
        double sum = 0;

        // Calculate mean
        for(Integer value : arr){
            total += value;
        }
        mean = total/arr.size();

        // Calculate variance
        for(Integer value : arr){
            sum += Math.pow(value - mean, 2);
        }
        variance = sum/arr.size();

        // Calculate deviation
        deviation = Math.sqrt(variance);

        System.out.printf("%.1f", deviation);
    }
}
