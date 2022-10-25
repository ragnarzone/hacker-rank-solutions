package daysofstatistics.day05;

public class NormalDistributionII {
    public static void main(String[] args) {
        int mean = 70;
        int stDeviation = 10;

        System.out.format("%.2f%n", 100 * (1 - cumulative(80, mean, stDeviation)));
        System.out.format("%.2f%n", 100 * (1 - cumulative(60, mean, stDeviation)));
        System.out.format("%.2f%n", 100 * (cumulative(60, mean, stDeviation)));
    }

    private static double cumulative(double x, int mean, int stDeviation){
        return 0.5 * (1 + erf((x-mean)/(stDeviation*Math.sqrt(2))));
    }

    public static double erf(double z) {
        double t = 1.0 / (1.0 + 0.5 * Math.abs(z));

        // use Horner's method
        double ans = 1 - t * Math.exp( -z*z   -   1.26551223 +
                t * ( 1.00002368 +
                        t * ( 0.37409196 +
                                t * ( 0.09678418 +
                                        t * (-0.18628806 +
                                                t * ( 0.27886807 +
                                                        t * (-1.13520398 +
                                                                t * ( 1.48851587 +
                                                                        t * (-0.82215223 +
                                                                                t * ( 0.17087277))))))))));
        if (z >= 0) return  ans;
        else        return -ans;
    }

    // fractional error less than x.xx * 10 ^ -4.
    // Algorithm 26.2.17 in Abromowitz and Stegun, Handbook of Mathematical.
    // private static double erf(double z) {
    //     double t = 1.0 / (1.0 + 0.47047 * Math.abs(z));
    //     double poly = t * (0.3480242 + t * (-0.0958798 + t * (0.7478556)));
    //     double ans = 1.0 - poly * Math.exp(-z*z);
    //     if (z >= 0) return  ans;
    //     else        return -ans;
    // }
}
