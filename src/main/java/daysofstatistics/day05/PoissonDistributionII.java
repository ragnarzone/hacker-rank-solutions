package daysofstatistics.day05;

public class PoissonDistributionII {
    public static void main(String[] args) {
        double a = 0.88;
        double b = 1.55;

        // E[x^2] = lambda + lambda^2
        double costA = 160 + 40 * (a+a*a);
        double costB = 128 + 40 * (b+b*b);

        System.out.format("%.3f%n", costA);
        System.out.format("%.3f", costB);
    }
}
