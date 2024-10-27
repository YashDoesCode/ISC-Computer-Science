package ISC_XI_Computer_Science;

import java.util.Scanner;

public class ArrayMax {
     int[][] arr;
     int m;

    public ArrayMax(int mm) {
        m = mm;
        arr = new int[m][m];
    }
    public void readarray() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = input.nextInt();
            }
        }
    }
    public void large() {
        for (int i = 0; i < m; i++) {
            int max = arr[i][0];
            for (int j = 1; j < m; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            System.out.println("The largest element in row " + (i + 1) + " is: " + max);
        }
    }
    public void display() {
        System.out.println("Matrix elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the order of the matrix: ");
        int order = input.nextInt();

        ArrayMax matrix = new ArrayMax(order);

        matrix.readarray();
        matrix.display();
        matrix.large();
    }
}
