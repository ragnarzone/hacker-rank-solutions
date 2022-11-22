package datastructures.stacks;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class EqualStacks {
    static class Result {

        public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
            // reverse arrays
            Collections.reverse(h1);
            Collections.reverse(h2);
            Collections.reverse(h3);

            // use new arrays to store sum of all previous elements in reversed arrays
            // kind of escalation of values
            ArrayList<Integer> array1 = new ArrayList<>();
            ArrayList<Integer> array2 = new ArrayList<>();
            ArrayList<Integer> array3 = new ArrayList<>();

            // put the elements in new arrays as described above
            int current1 = 0;
            int current2 = 0;
            int current3 = 0;
            for (Integer integer : h1) {
                current1 += integer;
                array1.add(current1);
            }
            for (Integer integer : h2) {
                current2 += integer;
                array2.add(current2);
            }
            for (Integer integer : h3) {
                current3 += integer;
                array3.add(current3);
            }

            // debug output
            System.out.println(array1);
            System.out.println(array2);
            System.out.println(array3);

            // put given arrays to outer one for defining shortest one
            ArrayList<ArrayList<Integer>> toMinimum = new ArrayList<>();
            toMinimum.add(array1);
            toMinimum.add(array2);
            toMinimum.add(array3);

            int minimum = 100000;
            int numOfMinArray = 0;

            // define shortes array
            for (int i = 0; i < 3; i++) {
                if(toMinimum.get(i).size() < minimum){
                    minimum = toMinimum.get(i).size();
                    numOfMinArray = i;
                }
            }
            // debug message
            System.out.println(numOfMinArray);

            // reverse shortest array for iteration from bigest height
            Collections.reverse(toMinimum.get(numOfMinArray));

            // iterate
            int currentValue = 0;
            for(Integer value : (toMinimum.get(numOfMinArray))){
                // if the biggest value present in all of the arrays break out of the loop
                // this is desired value
                if(array1.contains(value) && array2.contains(value) && array3.contains(value)){
                    currentValue = value;
                    break;
                }
            }

            return currentValue;
        }

    }

    public static class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int n1 = Integer.parseInt(firstMultipleInput[0]);

            int n2 = Integer.parseInt(firstMultipleInput[1]);

            int n3 = Integer.parseInt(firstMultipleInput[2]);

            List<Integer> h1 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            List<Integer> h2 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            List<Integer> h3 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            int result = Result.equalStacks(h1, h2, h3);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }

}
