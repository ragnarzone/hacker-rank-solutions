package daysofcode.day05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loops {
    public static class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            bufferedReader.close();

            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + n*i);
            }
        }
    }
}
