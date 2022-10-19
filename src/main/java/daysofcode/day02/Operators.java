package daysofcode.day02;

public class Operators {
    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        int out = (int) Math.round(meal_cost
                + meal_cost * tip_percent / 100.0
                + meal_cost * tax_percent / 100.0);
        System.out.println(out);
    }
}
