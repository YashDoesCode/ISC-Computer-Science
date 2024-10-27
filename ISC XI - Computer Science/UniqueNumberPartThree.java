import java.util.Scanner;

public class UniqueNumberPartThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input m and n:\n");
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        System.out.println("The Unique-Digit integers are:");
        int count = 0;

        for (int i = m; i <= n; i++) {
            boolean[] seen = new boolean[10];
            int num = i;
            boolean isUnique = true;

            while (num > 0) {
                if (seen[num % 10]) {
                    isUnique = false;
                    break;
                }
                seen[num % 10] = true;
                num /= 10;
            }

            if (isUnique) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nFrequency of unique-digit integers is: " + count);

        scanner.close();
    }
}
