import java.util.Scanner;

public class EvilNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        int countOnes = 0;

        // Count the number of 1s in the binary representation
        while (number > 0) {
            if (number % 2 == 1) {
                countOnes++;
            }
            number /= 2;
        }

        // Check if the number is evil
        boolean isEvil = countOnes % 2 == 0;

        // Display the result
        if (isEvil) {
            System.out.println("The number is an evil number.");
        } else {
            System.out.println("The number is not an evil number.");
        }
    }
}
