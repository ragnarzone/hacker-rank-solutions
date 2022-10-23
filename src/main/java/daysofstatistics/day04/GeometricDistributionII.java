package daysofstatistics.day04;

public class GeometricDistributionII {
    public static void main(String[] args) {
        //Initial values
        double p = (double) 1/3;
        int n = 5;

        double result = 0;
        for (int i = 1; i <= n; i++) {
            result += geometric(i, p);
        }
        System.out.format("%.3f", result);
    }

    private static double geometric(int n, double p) {
        return Math.pow(1 - p, n - 1) * p;
    }
}
