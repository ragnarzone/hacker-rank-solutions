package daysofstatistics.day00;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class MeanMedianMode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] values = new int[n];
        for(int i = 0; i < n; i++){
            values[i] = scanner.nextInt();
        }
        scanner.close();

        Arrays.sort(values);

        //mean
        int total = 0;
        for(int value : values){
            total += value;
        }
        double mean = (double) total/n;

        //median
        double median = 0;
        if(n%2 == 0){
            median = (values[n/2-1] + values[n/2]) / 2.0;
        } else {
            median = values[n/2];
        }

        //mode
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxOccurences = 0;
        int occurences = 0;
        int mode = 0;
        for(int value : values){
            map.merge(value, 1, Integer::sum);
            occurences = map.get(value);
            if(occurences > maxOccurences || (occurences == maxOccurences && value < mode)){
                maxOccurences = occurences;
                mode = value;
            }
        }
        System.out.println(mean);
        System.out.println(median);
        System.out.println(mode);
    }
}
