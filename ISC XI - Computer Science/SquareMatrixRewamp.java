import java.util.Scanner;

public class SquareMatrixRewamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the 2D array: ");
        int l = scanner.nextInt();

        int[][] array2D = new int[l][l];

        int counter = 1;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                array2D[i][j] = counter++;
            }
        }

        System.out.println("Generated 2D array:");
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print(array2D[i][j] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}
