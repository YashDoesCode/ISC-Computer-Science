import java.util.Scanner;

public class GoldbachNumber {
    
    int n;
    public GoldbachNumber(int input) {
        n = input;
    }
    public boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public void OddPrimePair(int target) {
        boolean found = false;

        for (int i = 3; i <= target / 2; i += 2) {
            int sum = target - i;

            if (isPrime(i) && isPrime(sum)) {
                System.out.println("Goldbach found: " + i + " + " + sum + " = " + target);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No Goldbach found!");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int target = scanner.nextInt();

        if (target % 2 != 0) {
            System.out.println("Input must be a even Number");
            return;
        }
        GoldbachNumber object = new GoldbachNumber(target);
        object.OddPrimePair(target);
    }
}
