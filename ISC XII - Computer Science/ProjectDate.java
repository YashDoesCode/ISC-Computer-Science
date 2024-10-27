    /*
1. Start
2. Initialize `Month` array with the number of days in each month.
3. Initialize `Week` array with the names of the days of the week.
4. Define `isLeap` function to determine if a year is a leap year.
5. Define `isValid` function to check if a given date is valid.
6. Define `DW` function to get the index of a day of the week given its name.
7. Define `Dater` function to add a specified number of days to a given date.
8. Initialize a `Scanner` to read user input.
9. Prompt the user to input the project submission date (day, month, year).
10. Read the user's input for day, month, and year.
11. Prompt the user to input the day of the week.
12. Read the user's input for the day of the week.
13. Create a `ProjectDate` object.
14. Call `isValid` with the user-inputted day, month, and year. If it's invalid, print "Invalid Date Inputted" and terminate.
15. Call `DW` with the user-inputted day of the week to get its index. If it's -1 (invalid), print "Invalid Day of the week" and terminate.
16. Call `Dater` with the inputted day, month, year, and 90 days to add, which computes the new date 90 days later.
17. Compute the new day of the week index by adding 90 to the input day of the week index, then taking modulo 7.
18. Print the computed day of the week based on the updated index.
19. End. 
 */
import java.util.Scanner;

public class ProjectDate {
    int[] Month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    String[] Week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    boolean isLeap(int y) {
        return y % 4 == 0 && (y % 100 != 0 || y % 400 == 0);
    }
    boolean isValid(int d, int m, int y) {
        if (y < 1000 || y > 9999 || m < 1 || m > 12) return false;
        int daysInMonth = Month[m - 1];
        if (m == 2 && isLeap(y)) daysInMonth = 29;
        return d >= 1 && d <= daysInMonth;
    }
    int DW(String dayName) {
        for (int i = 0; i < Week.length; i++) {
            if (Week[i].equalsIgnoreCase(dayName)) return i;
        }
        return -1;
    }
    int[] Dater(int d, int m, int y, int Add) {
        while (Add > 0) {
            int daysInCurrentMonth = Month[m - 1];
            if (m == 2 && isLeap(y)) daysInCurrentMonth = 29;
            int remaining = daysInCurrentMonth - d;
            if (Add <= remaining) {
                d += Add;
                break;
            } else {
                Add -= (remaining + 1);
                d = 1;
                m++;
                if (m > 12) {
                    m = 1;
                    y++;
                }
            }
        }
        return new int[]{d, m, y};
    }
    int[] SubtractDay(int d, int m, int y) {
        d -= 1; 
        if (d < 1) { 
            m -= 1; 
            if (m < 1) { 
                m = 12;
                y -= 1;
            }
            d = Month[m - 1];
            if (m == 2 && isLeap(y)) {
                d = 29;
            }
        }
        return new int[]{d, m, y}; 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Project date (day month year): ");
        int d = scanner.nextInt();
        int m = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Day of the week: ");
        String w = scanner.nextLine();
        
        ProjectDate store = new ProjectDate();
        if (!store.isValid(d, m, y)) {
            System.out.println("Invalid Date Inputted");
            return;
        }
        int dayOfWeek = store.DW(w);
        if (dayOfWeek == -1) {
            System.out.println("Invalid Day of the week");
            return;
        }
        int[] newDate = store.Dater(d, m, y, 90);
        int nDay = (dayOfWeek + 90) % 7;
        System.out.println("Project Submission Date: " + newDate[0] + "/" + newDate[1] + "/" + newDate[2]);
        System.out.println("Day of the week: " + store.Week[nDay]);   
        int[] previousDate = store.SubtractDay(newDate[0], newDate[1], newDate[2]);
        int perv = (nDay - 1 + 7) % 7;
        System.out.println("Previous Project Submission Date: " + previousDate[0] + "/" + previousDate[1] + "/" + previousDate[2]);
        System.out.println("Day of the week: " + store.Week[perv]);
    }
}
