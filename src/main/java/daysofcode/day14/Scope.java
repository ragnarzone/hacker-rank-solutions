package daysofcode.day14;

import java.util.Scanner;

public class Scope {
    static class Difference {
        private int[] elements;
        public int maximumDifference;

        public Difference(int[] a){
            this.elements = a;
        }

        public void computeDifference(){
            int currentDifference = 0;
            for(int i = 0; i < elements.length; i++){
                for (int j = i+1; j < elements.length; j++) {
                    currentDifference = Math.abs(elements[i]-elements[j]);
                    if(currentDifference > maximumDifference){
                        maximumDifference = currentDifference;
                    }
                }
            }
        }

    } // End of Difference class

    public static class Solution {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            sc.close();

            Difference difference = new Difference(a);

            difference.computeDifference();

            System.out.print(difference.maximumDifference);
        }
    }
}
