import java.util.Scanner;

public class RecursiveArraySum {
    static int i = 0;
    static int Sum(int array[], int limit) {
        if (limit <= 0) {
            return 0;
        } else {
            return array[limit - 1] + Sum(array, limit - 1);
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the limit to the Array : ");
            int limit = scanner.nextInt();
            int array[] = new int[limit];

            System.out.println("Enter " + limit + " elements in the Array : ");
            for (i = 0; i < limit; i++) {
                array[i] = scanner.nextInt();
            }

            int output = Sum(array, limit);
            System.out.println("The sum of the elements in the array is: " + output);
        }
    }
}