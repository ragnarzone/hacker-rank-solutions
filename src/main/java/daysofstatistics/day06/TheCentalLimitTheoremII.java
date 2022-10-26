package daysofstatistics.day06;

public class TheCentalLimitTheoremII {
    public static void main(String[] args) {
        double mean = 2.4;
        double stDeviation = 2.0;
        int numOfStudents = 100;
        int numOfTickets = 250;

        double samplesMean = numOfStudents * mean;
        double samplesStDev  = Math.sqrt(numOfStudents) * stDeviation;

        System.out.format("%.4f", cumulative(numOfTickets, samplesMean, samplesStDev));
    }

    private static double cumulative(double x, double mean, double stDeviation){
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
}
