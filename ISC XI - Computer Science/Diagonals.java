import java.util.Scanner;

public class Diagonals {
    public static void main(String[] args) {
         Scanner scanner = new Scanner (System.in);
        System.out.println("Enter Limit of the Array in n & m");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int arr[][]=new int[n][m];
        System.out.println("Enter the elements into the Array");
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Upper Diagonal Elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nLower Diagonal Elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}