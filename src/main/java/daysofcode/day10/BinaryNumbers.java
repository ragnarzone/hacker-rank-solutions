package daysofcode.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        int count = 0;
        int max = 0;
        while(n>0){
            if(n%2==1){
                count++;
                max = Math.max(count, max);
            } else{
                count = 0;
            }
            n/=2;
        }
        System.out.println(max);
    }
}
