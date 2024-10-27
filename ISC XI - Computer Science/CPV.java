import java.util.Scanner;

public class CPV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of the Array:");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid Size!");
        } else {
            int[] A = new int[n];
            char[] B = new char[n];

            System.out.println("Enter elements in the array:");

            for (int i = 0; i < n; i++) {
                A[i] = scanner.nextInt();
                if(A[i]<0){
                    B[i]='N';
                }
                else {
                    B[i] = 'P';
                }
            }

            // Bubble sort the arrays
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (A[j] > A[j + 1]) {
                        // Swap integers
                        int temp = A[j];
                        A[j] = A[j + 1];
                        A[j + 1] = temp;

                        // Swap characters
                        char tempChar = B[j];
                        B[j] = B[j + 1];
                        B[j + 1] = tempChar;
                    }
                }
            }

            // Display the sorted array in the specified format
            System.out.println("Sorted Array:");
            for (int i = 0; i < n; i++) {
                System.out.print(B[i] + "," + A[i]);
                if (i < n - 1) {
                    System.out.print(",");
                }
            }
            System.out.println();

            // Binary search
            System.out.println("Enter the number to search:");
            int num = scanner.nextInt();
            int result = binarySearch(A, num);

            if (result != -1) {
                System.out.println("Search Successful!");
                System.out.println(num + " is present at index " + result);
            } else {
                System.out.println("Search Unsuccessful!");
            }
        }
    }

    // Binary search method
    private static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Not found
    }
}
