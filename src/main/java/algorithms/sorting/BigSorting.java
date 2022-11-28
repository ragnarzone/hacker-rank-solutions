package algorithms.sorting;

import java.io.*;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class BigSorting {
    static class Result {


        public static List<String> bigSorting(List<String> unsorted) {
            // Write your code here
            Collections.sort(unsorted, new Comparator<String>() {
                public int compare(String a, String b){
                    if(a.length() > b.length()){
                        return 1;
                    } else if(a.length() < b.length()){
                        return -1;
                    } else{
                        BigInteger bigA = new BigInteger(a);
                        BigInteger bigB = new BigInteger(b);
                        return bigA.compareTo(bigB);
                    }
                }
            });
            return unsorted;
        }

    }

    public static class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            List<String> unsorted = IntStream.range(0, n).mapToObj(i -> {
                        try {
                            return bufferedReader.readLine();
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    })
                    .collect(toList());

            List<String> result = Result.bigSorting(unsorted);

            bufferedWriter.write(
                    result.stream()
                            .collect(joining("\n"))
                            + "\n"
            );

            bufferedReader.close();
            bufferedWriter.close();
        }
    }

}
