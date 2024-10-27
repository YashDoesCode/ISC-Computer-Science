package ISC_XII_Computer_Science;

/*
1. Start
2. Declare a method `isValid` that checks if a given string contains only digits.
3. In `isValid`, loop through each character of the string.
4. If a character is not a digit, return false from `isValid`.
5. If all characters are digits, return true from `isValid`.
6. Declare a method `isIncreasing` that checks if the digits in the given string are in ascending order.
7. In `isIncreasing`, loop through the string, checking adjacent characters.
8. If any character is greater than the next one, return false from `isIncreasing`.
9. If all characters are in ascending order, return true from `isIncreasing`.
10. Declare a method `isDecreasing` that checks if the digits in the given string are in descending order.
11. In `isDecreasing`, loop through the string, checking adjacent characters.
12. If any character is smaller than the next one, return false from `isDecreasing`.
13. If all characters are in descending order, return true from `isDecreasing`.
14. In the `main` method, create a `Scanner` object for user input.
15. Prompt the user to enter a number and store it in a string variable `s`.
16. Create an instance of `IDBChecker`.
17. Use `isValid` to check if `s` contains only digits. If false, print "Invalid Input found!".
18. If `isValid` is true, check if `s` is increasing with `isIncreasing`. If true, print "Increasing Number found!".
19. If `isIncreasing` is false, check if `s` is decreasing with `isDecreasing`. If true, print "Decreasing Number found!". Otherwise, print "Bouncy Number found!".
20. End
 */
import java.util.Scanner;

public class IDBChecker {
    boolean isValid(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!Character.isDigit(ch)) {
                return false; 
            }
        }
        return true;
    }
    boolean isIncreasing(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) {
                return false; 
            }
        }
        return true;
    }
    boolean isDecreasing(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) < s.charAt(i + 1)) {
                return false;
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        String s = ""; 
        try {
            s = scanner.next(); 
            IDBChecker checker = new IDBChecker();

            if (checker.isValid(s)) {
                if (checker.isIncreasing(s)) {
                    System.out.println(s+ " is an Increasing number");
                } else if (checker.isDecreasing(s)) {
                    System.out.println(s+ " is an Decreasing number");
                } else {
                    System.out.println(s+ " is an Bouncy nmber");
                }
            } else {
                System.out.println("Invalid Input");
            }
        } catch (Exception e) { 
            System.out.println("An error occurred: Invalid input. Please enter a number.");
        } finally {
            scanner.close();
        }
    }
}
