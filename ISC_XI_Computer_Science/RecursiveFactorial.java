package ISC_XI_Computer_Science;

import java.util.Scanner;

public class RecursiveFactorial {
    static int isFactorial (int input) {
        if (input == 1 || input == 0) {
            return 1;
        }
        else {
            return input * isFactorial(input - 1);
        }
    }
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        RecursiveFactorial obj = new RecursiveFactorial();
        System.out.println("Enter the number : ");
        int input = scanner.nextInt();
        int store=isFactorial (input);
        System.out.println("Factorial of " + input + " is : "+ store);
    }
}
