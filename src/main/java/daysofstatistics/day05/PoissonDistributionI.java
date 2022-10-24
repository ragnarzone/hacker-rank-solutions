package daysofstatistics.day05;

public class PoissonDistributionI {
    public static void main(String[] args) {
        double lambda = 2.5;
        int k = 5;

        System.out.format("%.3f", poisson(k, lambda));
    }

    private static double poisson(int k, double lambda){
        return (Math.pow(lambda, k) * Math.pow(Math.E, -1 *lambda))/factorial(k);
    }

    private static int factorial(int k){
        int result = 1;
        while(k > 0){
            result *= k--;
        }
        return result;
    }
}
