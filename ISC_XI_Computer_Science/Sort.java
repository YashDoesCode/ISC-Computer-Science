package ISC_XI_Computer_Science;

import java.util.Scanner;

public class Sort {
    int[] arr;
    int len;
    int n;

    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit of the array:");
        n = scanner.nextInt();
        len = n;
        arr = new int[len];

        System.out.println("Enter " + len + " integers:");
        for (int i = 0; i < len; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    public void selectionSort() {
        for (int i = 0; i < len - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public void display() {
        System.out.println("Sorted array in ascending order:");
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Sort sorter = new Sort();
        sorter.read();
        sorter.selectionSort();
        sorter.display();
    }
}
