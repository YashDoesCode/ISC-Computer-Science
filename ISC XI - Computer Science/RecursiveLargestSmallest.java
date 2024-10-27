import java.util.Scanner;

public class RecursiveLargestSmallest {
    static int i = 0;
    static int findLargest(int array[], int index, int max) {
        if (index == array.length) {
            return max;
        }
        if (array[index] > max) {
            max = array[index];
        }
        return findLargest(array, index + 1, max);
    }
    static int findSmallest(int array[], int index, int min) {
        if (index == array.length) {
            return min;
        }
        if (array[index] < min) {
            min = array[index];
        }
        return findSmallest(array, index + 1, min);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the limit for the array: ");
        int limit = scanner.nextInt();
        int array[] = new int[limit];

        System.out.println("Enter " + limit + " elements in the array: ");
        for (i = 0; i < limit; i++) {
            array[i] = scanner.nextInt();
        }

        int largest = findLargest(array, 0, array[0]);
        int smallest = findSmallest(array, 0, array[0]);

        System.out.println("Largest number in the array: " + largest);
        System.out.println("Smallest number in the array: " + smallest);
    }
}
