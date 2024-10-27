import java.util.Scanner;

public class CompositeMagic {
    static boolean isComposite(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return true;
            }
        }
        return false;
    }

    static boolean isMagic(int num) {
        while (num > 9) {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num == 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the range of numbers to perform check (m and n): ");

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        if (m < n) {
            System.out.println("Composite Magic Numbers: ");
            int count = 0;

            for (int i = m; i <= n; i++) {
                if (isComposite(i) && isMagic(i)) {
                    System.out.print(i + ", ");
                    count++;
                }
            }

            if (count > 0) {
                System.out.println("\nFrequency: " + count);
            } else {
                System.out.println("No Composite Magic Numbers found in the given range.");
            }
        } else {
            System.out.println("Invalid range. Please make sure m < n.");
        }
    }
}
