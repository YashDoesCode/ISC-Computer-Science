package ISC_XI_Computer_Science;

import java.util.Scanner;

public class PrimePalinGen {
    private int start;
    private int end;

    public PrimePalinGen(int a, int b) {
        start = a;
        end = b;
    }

    public int isPrime(int i) {
        if (i <= 1) {
            return 0; 
        }
        for (int j = 2; j * j <= i; j++) {
            if (i % j == 0) {
                return 0; 
            }
        }
        return 1; 
    }

    public int isPalin(int i) {
        int original = i;
        int reversed = 0;
        while (i != 0) {
            int digit = i % 10;
            reversed = reversed * 10 + digit;
            i /= 10;
        }
        return original == reversed ? 1 : 0;
    }

    public void generate() {
        System.out.println("Prime Palindrome Numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isPrime(i) == 1 && isPalin(i) == 1) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();

        PrimePalinGen Obj= new PrimePalinGen(start, end);
        Obj.generate();
    }
}
