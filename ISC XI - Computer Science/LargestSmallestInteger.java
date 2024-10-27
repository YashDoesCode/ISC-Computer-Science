import java.util.Scanner;

public class LargestSmallestInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter Limit of the Array in n & m");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int arr[][]=new int[n][m];
        System.out.println("Enter the elements into the Array");
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int largest = arr[0][0];
        int smallest = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int Compare = arr[i][j];

                if (Compare > largest) {
                    largest = Compare;
                }

                if (Compare < smallest) {
                    smallest = Compare;
                }
            }
        }

        System.out.println("Largest Element: " + largest);
        System.out.println("Smallest Element: " + smallest);
    }
}