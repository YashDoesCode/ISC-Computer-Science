import java.util.Scanner;

public class Recursive_Factorial {
    static int factorial (int n) {
       if (n == 1) {
           return 1;
       }
       else {
            return n * factorial(n-1);
       }
    }
    public static void main (String [] args) {
            Scanner scanner = new Scanner (System.in);
            Recursive_Factorial obj = new Recursive_Factorial();
             System.out.println("Enter the number");
            int number = scanner.nextInt();
            System.out.println("Output : ");
            int result = factorial(number);
            System.out.print(result);
    }
}
