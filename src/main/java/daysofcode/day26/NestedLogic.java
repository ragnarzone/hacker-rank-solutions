package daysofcode.day26;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class NestedLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayReturned = scanner.nextInt();
        int monthReturned = scanner.nextInt();
        int yearReturned = scanner.nextInt();

        int dayExpected = scanner.nextInt();
        int monthExpected = scanner.nextInt();
        int yearExpected = scanner.nextInt();

        LocalDate dateReturned = LocalDate.of(yearReturned, monthReturned, dayReturned);
        LocalDate dateExpected = LocalDate.of(yearExpected, monthExpected, dayExpected);

        long fine = 0;
        if (dateReturned.isAfter(dateExpected)){
            if(dateReturned.getYear() == dateExpected.getYear()){
                if(dateReturned.getMonth() == dateExpected.getMonth()){
                    fine = 15 * Math.abs(ChronoUnit.DAYS.between(dateReturned, dateExpected));
                } else {
                    fine = 500 * Math.abs(ChronoUnit.MONTHS.between(dateReturned, dateExpected));
                }
            } else {
                fine = 10000;
            }
        }
        System.out.println(fine);
    }
}
