package daysofcode.day29;

import java.io.*;
import java.util.stream.IntStream;

public class BitwiseAnd {
    static class Result {

        public static int bitwiseAnd(int N, int K) {
            int result = 0;
            for(int i = 1; i < N ; i++){
                for(int j = i+1; j <= N ; j++){
                    int and = i&j;
                    if(result < and && and < K){
                        result = and;
                    }
                }
            }
            return result;
        }

    }

    public static class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int t = Integer.parseInt(bufferedReader.readLine().trim());

            IntStream.range(0, t).forEach(tItr -> {
                try {
                    String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                    int count = Integer.parseInt(firstMultipleInput[0]);

                    int lim = Integer.parseInt(firstMultipleInput[1]);

                    int res = Result.bitwiseAnd(count, lim);

                    bufferedWriter.write(String.valueOf(res));
                    bufferedWriter.newLine();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });

            bufferedReader.close();
            bufferedWriter.close();
        }
    }
}
