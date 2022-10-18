package daysofcode.day01;

import java.util.Scanner;

public class DataTypes {
    // Solution
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        int newInt = Integer.parseInt(scan.nextLine());
        double newDouble = Double.parseDouble(scan.nextLine());
        String newString = scan.nextLine();



        System.out.println(i+newInt);
        System.out.printf("%.1f", d+newDouble);
        System.out.println();
        System.out.println(s+newString);

        scan.close();
    }
}
