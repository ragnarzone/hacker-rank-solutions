package daysofstatistics.day04;

public class GeometricDistributionI {
    public static void main(String[] args) {
        //Initial values
        double p = (double) 1/3;
        int n = 5;

        double result = geometric(n, p);
        System.out.format("%.3f", result);
    }

    private static double geometric(int n, double p) {
        return Math.pow(1 - p, n - 1) * p;
    }
}
