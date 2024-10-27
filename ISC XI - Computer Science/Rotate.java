import java.util.Scanner;

public class Rotate {
    private int[][] a;
    private int[][] b;
    private int r;
    private int c;

    public Rotate(int x, int y) {
        r = x;
        c = y;
        a = new int[r][c];
        b = new int[c][r];
    }
    public void fillArray() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter elements for the original matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = input.nextInt();
            }
        }
    }
    public void rotate90DegClock() {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                b[j][r - 1 - i] = a[i][j];
            }
        }
    }
    public void rotate90DegAntiClock() {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                b[c - 1 - j][i] = a[i][j];
            }
        }
    }
    public void displayOriginalArray() {
        System.out.println("Original Matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void displayRotatedArray() {
        System.out.println("Rotated Matrix:");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = input.nextInt();

        Rotate matrix = new Rotate(rows, cols);

        matrix.fillArray();
        matrix.displayOriginalArray();

        System.out.println("Rotated 90 degrees clockwise:");
        matrix.rotate90DegClock();
        matrix.displayRotatedArray();

        System.out.println("Rotated 90 degrees counterclockwise:");
        matrix.rotate90DegAntiClock();
        matrix.displayRotatedArray();
    }
}