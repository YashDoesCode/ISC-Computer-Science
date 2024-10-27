import java.util.Scanner;

public class BinarySearch {
    static boolean binarySearch(int[] arr, int target) {
        int left = 0;
        int n = arr.length;
        int right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the Array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n]; // Use the specified length
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        boolean isFound = binarySearch(arr, target);

        if (isFound) {
            System.out.println("Element found in the array.");
        } else {
            System.out.println("Element not found in the array.");
        }
        scanner.close();
    }
}
