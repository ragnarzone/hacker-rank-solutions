package daysofcode.day25;

import java.util.Scanner;

public class RunningTimeAndComplexity {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int[] toTest = new int[T];
        for(int i = 0; i < T; i++){
            toTest[i] = scanner.nextInt();
        }
        scanner.close();


        for (int i : toTest) {

            if(i == 1){
                System.out.println("Not prime");
                continue;
            }

            int sqrt = (int) Math.sqrt(i);
            boolean flag = false;

            for(int j = 2; j <= sqrt; j++){
                if (i % j == 0) {
                    flag = true;
                    break;
                }
            }
            if(flag){
                System.out.println("Not prime");
            } else {
                System.out.println("Prime");
            }
        }
    }
}
