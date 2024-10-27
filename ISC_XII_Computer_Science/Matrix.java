package ISC_XII_Computer_Science;

import java.util.Scanner;

public class Matrix {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = 0, N = 0;
        while (M <= 0 || M >= 10) {
            System.out.print("Enter the number of rows (M) [1-9]: ");
            M = sc.nextInt();
        }
        while (N <= 2 || N >= 6) {
            System.out.print("Enter the number of columns (N) [3-5]: ");
            N = sc.nextInt();
        }
        int[][] A = new int[M][N];
        for (int i = 0; i < M; i++) {
            System.out.println("Enter elements for row " + (i + 1) + ": ");
            for (int j = 0; j < N; j++) {
                int element = -1;
                while (element < 0 || element > 7) {
                    element = sc.nextInt();
                }
                A[i][j] = element;
            }
        }
        System.out.println("\nFILLED MATRIX");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nDECIMAL EQUIVALENT");
        for (int i = 0; i < M; i++) {
            int decimalEquivalent = 0;
            for (int j = 0; j < N; j++) {
                decimalEquivalent += A[i][j] * Math.pow(8, N - j - 1);
            }
            System.out.println(decimalEquivalent);
        }
    }
}
