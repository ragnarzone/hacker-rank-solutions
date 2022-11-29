package algorithms.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class InsertionSortPart1 {
    static class Result {

        public static void insertionSort1(int n, List<Integer> arr) {
            int valueToInsert = arr.get(n-1);
            int pointer = n-2;
            while(pointer >= 0 && valueToInsert < arr.get(pointer)){
                arr.set(pointer+1, arr.get(pointer));
                pointer--;
                for (Integer integer : arr) {
                    System.out.print(integer + " ");
                }
                System.out.println();
            }
            arr.set(pointer+1, valueToInsert);
            for (Integer integer : arr) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }

    }

    public static class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            Result.insertionSort1(n, arr);

            bufferedReader.close();
        }
    }
}
