import java.util.Scanner;
public class RecursiveFibonacci {
    static int isFibonacci(int input) {
        if (input == 1 || input == 0){
            return input;
        }
        else {
            return isFibonacci(input - 1 )+ isFibonacci(input - 2);
        }
    }
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        RecursiveFibonacci obj = new RecursiveFibonacci();
        System.out.println("Enter the number : ");
        int input = scanner.nextInt();
        int store = isFibonacci(input);
        System.out.println("Fibonacci Series : " + store);
    }
}
