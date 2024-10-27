import java.util.Scanner;

public class SquareMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        int[][] matrix = new int[n][n];
        int num = 1;

        int rowStart = 0, rowEnd = n - 1, colStart = 0, colEnd = n - 1;

        while (num <= n * n) {
            for (int i = 0; i <= colEnd; i++) matrix[rowStart][i] = num++;
            rowStart++;

            for (int i = 0; i <= rowEnd; i++) matrix[i][colEnd] = num++;
            colEnd--;

            for (int i = colEnd; i >= colStart; i--) matrix[rowEnd][i] = num++;
            rowEnd--;

            for (int i = rowEnd; i >= rowStart; i--) matrix[i][colStart] = num++;
            colStart++;
        }

        System.out.println("Circular Matrix:");
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
    }
}