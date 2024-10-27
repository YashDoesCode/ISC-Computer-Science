package ISC_XII_Computer_Science;

import java.util.Scanner;

public class Matrix2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int n = sc.nextInt();
        if (n <= 2 || n >= 10) {
            System.out.println("Invalid");
            System.exit(0);
        }
        int[][] arr = new int[n][n];
        System.out.println("Enter elements in the Array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }   
        System.out.println("Original Matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] != arr[j][i]) {
                    flag = false;
                    break;
                }
            }
            if (!flag) {
                break;
            }
        } 
        if (flag) {
            System.out.println("Symmetric");
        } else {
            System.out.println("Not-Symmetric");
        }
        int LeftSum = 0, RightSum = 0;
        for (int i = 0; i < n; i++) {
            LeftSum += arr[i][i];
            RightSum += arr[i][n - 1 - i];
        }
        System.out.println("Left Diagonal Sum: " + LeftSum + "\nRight Diagonal Sum: "+RightSum);
            }
}
