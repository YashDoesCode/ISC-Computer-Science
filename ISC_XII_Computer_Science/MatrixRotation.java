package ISC_XII_Computer_Science;

import java.util.Scanner;

public class MatrixRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of m & n: ");
        int M = sc.nextInt();
        int N = sc.nextInt();

        if (M < 3 || N < 3 || M > 9 || N > 9) {
            System.out.println("Invalid Range !");
            System.exit(0);
        }
        int[][] matrix = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int[][] Rev = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                Rev[i][j] = matrix[(i + 1) % M][j];
            }
        }
        System.out.println("Matrix after Rotation");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(Rev[i][j] + " ");
            }
            System.out.println();
        }
        int max = Rev[0][0], row = 0, col = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (Rev[i][j] > max) {
                    max = Rev[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println("Highest element: " + max + " ( Row: " + row + " and Column: " + col + " )");
    }
}
