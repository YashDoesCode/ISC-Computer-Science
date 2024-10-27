import java.util.Scanner;

public class RecursiveHamming {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check : ");
        int input = scanner.nextInt();

        if (isHammingNumber(input)) {
            System.out.println(input + " is Hamming !");
        } else {
            System.out.println(input + " is not a Hamming Digit");
        }

        scanner.close();
    }

    public static boolean isHammingNumber(int num) {
        while (num > 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else if (num % 3 == 0) {
                num /= 3;
            } else if (num % 5 == 0) {
                num /= 5;
            } else {
                return false; 
            }
        }

        return true; 
    }
}