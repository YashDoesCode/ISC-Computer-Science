import java.util.Scanner;

public class Recursive_Fibonacci {
    static int fibonacci(int input) {
        if (input == 0 || input == 1) {
            return input;
        } else {
            return fibonacci(input - 1) + fibonacci(input - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to calculate Fibonacci: ");
        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            int result = fibonacci(i);
            System.out.println("Fibonacci(" + i + ") = " + result);
        }
    }
}
