package daysofstatistics.day05;

public class NormalDistributionI {
    public static void main(String[] args) {
        int mean = 20;
        int stDeviation = 2;
        System.out.format("%.3f%n", cumulative(19.5, mean, stDeviation));
        System.out.format("%.3f%n", cumulative(22, mean, stDeviation) - cumulative(20, mean, stDeviation));
    }

    private static double cumulative(double x, int mean, int stDeviation){
        return 0.5 * (1 + erf((x-mean)/(stDeviation*Math.sqrt(2))));
    }

    // fractional error less than x.xx * 10 ^ -4.
    // Algorithm 26.2.17 in Abromowitz and Stegun, Handbook of Mathematical.
    private static double erf(double z) {
        double t = 1.0 / (1.0 + 0.47047 * Math.abs(z));
        double poly = t * (0.3480242 + t * (-0.0958798 + t * (0.7478556)));
        double ans = 1.0 - poly * Math.exp(-z*z);
        if (z >= 0) return  ans;
        else        return -ans;
    }
}
