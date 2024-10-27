package ISC_XI_Computer_Science;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of M (2 < M < 10): ");
        int m = scanner.nextInt();

        if (m > 2 && m < 10) {
            int[][] A = new int[m][m];

            System.out.println("Enter elements for the matrix:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    A[i][j] = scanner.nextInt();
                }
            }

            // Display matrix
            System.out.println("Array in matrix is:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(A[i][j] + " ");
                }
                System.out.println();
            }

            // Check for Symmetry
            int f = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    if (A[i][j] != A[j][i]) {
                        f = 1;
                        break;
                    }
                }
                if (f == 1) {
                    break;
                }
            }

            if (f == 0) {
                System.out.println("Symmetric!");
            } else {
                System.out.println("Not Symmetric");
            }

            int leftDiagonalSum = 0;
            int rightDiagonalSum = 0;
            System.out.println("Sum of diagonals:");
            for (int i = 0; i < m; i++) {
                leftDiagonalSum += A[i][i];
                rightDiagonalSum += A[i][m - 1 - i];
            }
            System.out.println("Left Diagonal Sum: " + leftDiagonalSum);
            System.out.println("Right Diagonal Sum: " + rightDiagonalSum);
        } else {
            System.out.println("Matrix size is out of range. Please ensure 2 < M < 10.");
        }
    }
}
