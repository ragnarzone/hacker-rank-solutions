package daysofcode.day06;

import java.util.Scanner;

public class LetsReview {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int i = 0; i < T; i++) {
            String str = scan.next();
            printEvensOdds(str);
        }
        scan.close();
    }

    public static void printEvensOdds(String str) {
        StringBuilder evens = new StringBuilder();
        StringBuilder odds  = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (i % 2 == 0) {
                evens.append(ch);
            } else {
                odds.append(ch);
            }
        }
        System.out.println(evens + " " + odds);
    }
}
