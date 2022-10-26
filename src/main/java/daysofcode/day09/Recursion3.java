package daysofcode.day09;

public class Recursion3 {
    public static int factorial(int n) {
        int result = 1;
        while(n > 1){
            result *= n--;
        }
        return result;
    }
}
