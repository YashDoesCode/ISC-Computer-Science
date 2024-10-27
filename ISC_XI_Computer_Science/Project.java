package ISC_XI_Computer_Science;

import java.util.Scanner;
public class Project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter DD/MM/YYYY & Completion Date : ");
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        int nod = scanner.nextInt();

        while (nod > 0) {
            if (day > 1) {
                day--;
            } else {
                if (month > 1) {
                    month--;
                    day = daysInMonth(month, year);
                } else {
                    year--;
                    month = 12;
                    month = daysInMonth(month, year);
                }
            }
            nod--;
        }
        System.out.print("Project Allotment Date : "+ day+"/"+month+"/"+year);
    }
    static int daysInMonth(int month,int year) {
        int [] DaysInMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        if (month == 2 && isLeapYear(month)){
            return 29;
        }
        return DaysInMonth[month];
    }
    static boolean isLeapYear(int year){
        return (year%4==0 && (year%100!=0 || year% 400==0));
    }
}
