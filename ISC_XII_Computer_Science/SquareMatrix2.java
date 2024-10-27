package ISC_XII_Computer_Science;

/*
 1. Start
2. Initialize a `Scanner` object to read user input.
3. Prompt the user to enter the order of a square matrix, ensuring it's between 4 and 9.
4. Read the matrix order from user input and assign it to variable `n`.
5. Check if `n` is within the range 4 to 9. If not, print an error message and exit.
6. Create a two-dimensional array `matrix` of size `n` x `n`.
7. Prompt the user to enter the elements of the `matrix`.
8. Use nested loops to fill the `matrix` with elements from user input.
9. Display the original `matrix` to the console.
10. Call `getBoundaryElements(matrix)` to extract the boundary elements of the `matrix`.
11. Call `bubbleSort(boundary)` to sort the boundary elements in ascending order.
12. Call `setBoundaryElements(matrix, boundary)` to update the `matrix` with sorted boundary elements.
13. Display the rearranged `matrix` to the console.
14. Print the non-boundary elements of the `matrix` to the console.
15. Call `productOfNonBoundary(matrix)` to calculate the product of non-boundary elements in the `matrix`.
16. Display the product of non-boundary elements to the console.
17. Close the `Scanner` to release system resources.
18. End
 */
import java.util.Scanner;

class SquareMatrix2 {
    static int[] Boundary(int[][] matrix) {
        int n = matrix.length;
        int[] boundary = new int[(n - 1) * 4];
        int index = 0;
        for (int i = 0; i < n; i++) {
            boundary[index++] = matrix[0][i];
        }
        for (int i = 1; i < n - 1; i++) {
            boundary[index++] = matrix[i][n - 1];
        }
        for (int i = n - 1; i >= 0; i--) {
            boundary[index++] = matrix[n - 1][i];
        }
        for (int i = n - 2; i > 0; i--) {
            boundary[index++] = matrix[i][0];
        }
        return boundary;
    }
    static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
    static void setBoundary(int[][] matrix, int[] boundary) {
        int n = matrix.length;
        int index = 0;
        for (int i = 0; i < n; i++) {
            matrix[0][i] = boundary[index++];
        }
        for (int i = 1; i < n - 1; i++) {
            matrix[i][n - 1] = boundary[index++];
        }
        for (int i = n - 1; i >= 0; i--) {
            matrix[n - 1][i] = boundary[index++];
        }
        for (int i = n - 2; i > 0; i--) {
            matrix[i][0] = boundary[index++];
        }
    }
    static int NonBoundary(int[][] matrix) {
        int n = matrix.length;
        int product = 1;
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                product *= matrix[i][j];
            }
        }
        return product;
    }
    static void display(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the order of the matrix (between 4 and 9):");
        int n = scanner.nextInt();
        if (n < 4 || n > 9) {
            System.out.println("Order must be between 4 and 9.");
            return;
        }
        int[][] matrix = new int[n][n];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Original Matrix:");
        display(matrix);
        int[] boundary = Boundary(matrix);
        bubbleSort(boundary);
        setBoundary(matrix, boundary);
        System.out.println("Rearranged Matrix:");
        display(matrix);
        System.out.println("Non-Boundary Elements:");
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int product = NonBoundary(matrix);
        System.out.println("Product of Non-Boundary elements = " + product);
        scanner.close();
    }
}
