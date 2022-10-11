package algorithms.implementation;

public class NumberLineJumps {
    // Solution
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        if (v1 < v2) return "NO";
        double y = (double)(x1 - x2)/(double)(v2 - v1);
        if(y % 1 != 0){
            return "NO";
        } else {
            return "YES";
        }
    }
}
