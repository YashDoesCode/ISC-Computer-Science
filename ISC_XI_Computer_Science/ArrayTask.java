package ISC_XI_Computer_Science;

import java.util.Scanner;

public class ArrayTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[4][4];

        System.out.println("Enter 16 numbers for the 4x4 array:");
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                matrix[i][j] = input.nextInt();

        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int num : row) System.out.print(num + "\t");
            System.out.println();
        }

        int diagonalSum = 0;
        for (int i = 0; i < 4; i++) diagonalSum += matrix[i][i];
        System.out.println("Sum of diagonal elements: " + diagonalSum);

        System.out.println("Upper diagonal elements:");
        for (int i = 0; i < 4; i++)
            for (int j = i + 1; j < 4; j++) System.out.print(matrix[i][j] + "\t");
        System.out.println();

        System.out.println("Lower diagonal elements:");
        for (int i = 1; i < 4; i++)
            for (int j = 0; j < i; j++) System.out.print(matrix[i][j] + "\t");
        System.out.println();

        System.out.println("Row-wise sum and Column-wise sum:");
        for (int i = 0; i < 4; i++) {
            int rowSum = 0, colSum = 0;
            for (int j = 0; j < 4; j++) {
                rowSum += matrix[i][j];
                colSum += matrix[j][i];
            }
            System.out.println("Row " + (i + 1) + " sum: " + rowSum);
            System.out.println("Column " + (i + 1) + " sum: " + colSum);
        }
    }
}
