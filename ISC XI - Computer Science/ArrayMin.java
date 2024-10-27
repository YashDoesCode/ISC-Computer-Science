import java.util.Scanner;

public class ArrayMin {
    int[][] arr;
    int m;

    public ArrayMin(int mm) {
        m = mm;
        arr = new int[m][m];
    }
    public void readarray() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the elements of the Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = input.nextInt();
            }
        }
    }
    public void Min() {
        for (int i = 0; i < m; i++) {
            int min = arr[i][0];
            for (int j = 1; j < m; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
            System.out.println("The Smallest element in row " + (i + 1) + " is: " + min);
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

        System.out.print("Enter the order of the Matrix : ");
        int order = input.nextInt();

        ArrayMin obj = new ArrayMin(order);

        obj.readarray();
        obj.display();
        obj.Min();
    }
}



