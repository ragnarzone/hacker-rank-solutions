package daysofstatistics.day04;

public class BinomialDistributionII {
    public static void main(String[] args) {
        //initial values
        double p = 0.12;
        int n = 10;

        //No more than 2 rejects
        double result = 0;
        for(int x = 0; x <= 2; x++){
            result += binomial(x, n, p);
        }
        System.out.format("%.3f%n", result);

        //At least 2 rejects
        result = 0;
        for(int x = 2; x <= n; x++){
            result += binomial(x, n, p);
        }
        System.out.format("%.3f%n", result);
    }

    private static double binomial(int x, int n, double p) {
        return combinations(n, x) * Math.pow(p, x) * Math.pow(1 - p, n - x);
    }

    private static int combinations(int n, int x) {
        return factorial(n) / (factorial(x) * factorial(n - x));
    }

    private static int factorial(int n) {
        int result = 1;
        while (n > 0) {
            result *= n--;
        }
        return result;
    }
}
