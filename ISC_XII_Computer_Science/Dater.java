package ISC_XII_Computer_Science;

import java.util.Scanner;

public class Dater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day number (between 1 and 366): ");
        int dayNumber = scanner.nextInt();
        System.out.print("Enter year (yyyy): ");
        int year = scanner.nextInt();
        System.out.print("Enter value of N (1 <= N <= 100): ");
        int N = scanner.nextInt();

        if (dayNumber < 1 || dayNumber > 366) {
            System.out.println("INCORRECT DAY NUMBER");
            return;
        }
        if (N <= 1 || N >= 100) {
            System.out.println("INCORRECT VALUE OF 'N'");
            return;
        }
        int[] daysInMonths = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] monthNames = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE",
                "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};
        int month = 0;
        int day = dayNumber;
        for (int i = 0; i < 12; i++) {
            if (day > daysInMonths[i]) {
                day -= daysInMonths[i];
            } else {
                month = i;
                break;
            }
        }
        System.out.println("ENTERED DATE: " + monthNames[month] + " " + day + ", " + year);
        day += N;
        while (day > daysInMonths[month]) {
            day -= daysInMonths[month];
            month++;
            if (month == 12) {
                month = 0;
                year++;
            }
        }
        System.out.println(N + " DAYS LATER: " + monthNames[month] + " " + day + ", " + year);
    }
}
