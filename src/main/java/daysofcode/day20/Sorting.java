package daysofcode.day20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Sorting {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int numberOfSwaps = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-1; j++){
                if(a.get(j) > a.get(j+1)){
                    swap(j, j+1, a);
                    numberOfSwaps++;
                }
            }
        }
        System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(n-1));

        bufferedReader.close();
    }

    public static void swap(int firstElem, int secondElem, List<Integer> a){
        int temp = a.get(firstElem);
        a.set(firstElem, a.get(secondElem));
        a.set(secondElem, temp);
    }
}
