package ISC_XI_Computer_Science;

import java.util.Scanner;

public class RecursiveHammingRange {

    private static void printHammingRange(int start, int end) {
        if (start > end) {
            return;
        }

        if (isHammingNumber(start)) {
            System.out.print(start + " ");
        }

        printHammingRange(start + 1, end);
    }


    private static boolean isHammingNumber(int num) {
        if (num == 1) {
            return true; 
        }

        if (num % 2 == 0) {
            return isHammingNumber(num / 2);
        }

        if (num % 3 == 0) {
            return isHammingNumber(num / 3);
        }

        if (num % 5 == 0) {
            return isHammingNumber(num / 5);
        }

        return false;  
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start Range: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end Range: ");
        int end = scanner.nextInt();

        System.out.println("Hamming numbers in the range [" + start + ", " + end + "]:");
        printHammingRange(start, end);

        scanner.close();
    }
}
