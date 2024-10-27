import java.util.Scanner;

public class PrimeAdam {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }
    public static boolean isAdam(int num) {
        int square = num * num;
        int revNum = reverse(num);
        int revSquare = revNum * revNum;
        return reverse(revSquare) == square;
    }
    public static boolean isPrimeAdam(int num) {
        return isPrime(num) && isAdam(num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("INPUT: m=");
        int m = sc.nextInt();
        System.out.print("n=");
        int n = sc.nextInt();
        int count = 0;
        String primeAdamNumbers = "";

        for (int i = m; i <= n; i++) {
            if (isPrimeAdam(i)) {
                primeAdamNumbers += i + " ";
                count++;
            }
        }
        System.out.println("THE PRIME-ADAM INTEGERS ARE:");
        if (count > 0) {
            System.out.println(primeAdamNumbers.trim());
        } else {
            System.out.println("NIL");
        }
        System.out.println("FREQUENCY OF PRIME-ADAM INTEGERS IS: " + count);
    }
}