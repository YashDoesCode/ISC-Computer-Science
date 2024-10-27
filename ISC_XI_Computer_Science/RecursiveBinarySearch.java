package ISC_XI_Computer_Science;

import java.util.Scanner;

public class RecursiveBinarySearch {
    static int mid;

    static int SearchMethod(int array[], int l, int h, int e) {
        if (l <= h) {
            mid = l + (h - l) / 2;

            if (e == array[mid]) {
                return mid;
            }

            if (e < array[mid]) {
                return SearchMethod(array, l, mid - 1, e);
            }

            return SearchMethod(array, mid + 1, h, e);
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n = scanner.nextInt();
        int array[] = new int[n];

        System.out.println("Enter " +n+" elements into the Array : ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter the element to Search: ");
        int a = scanner.nextInt();
        int lb = 0;
        int ub = n - 1;

        int result = SearchMethod(array, lb, ub, a);

        if (result != -1) {
            System.out.println("Search Success at index: " + result);
        } else {
            System.out.println("Search Unsuccessful!");
        }
    }
}

