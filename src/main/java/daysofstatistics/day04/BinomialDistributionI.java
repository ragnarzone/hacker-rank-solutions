package daysofstatistics.day04;

public class BinomialDistributionI {
    public static void main(String[] args) {
        double ratio = 1.09; // hardcoded value
        double p = ratio / (1 + ratio);
        int n     = 6;

        /* Calculate result */
        double result = 0;
        for (int x = 3; x <= n; x++) {
            result += binomial(x, n, p);
        }
        System.out.format("%.3f", result);
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
