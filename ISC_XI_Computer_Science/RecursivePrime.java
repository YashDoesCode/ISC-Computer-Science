package ISC_XI_Computer_Science;

import java.util.Scanner;

public class RecursivePrime {
    static boolean isPrime(int input) {
        if (input < 0){
            return false;
        }
        else if (input % 2 == 0|| input % 3 == 0) {
            return false;
        }
        else {
            return true;
        }
    }
    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);
        RecursivePrime obj = new RecursivePrime();
        System.out.println("Enter the number to check : ");
        int input = scanner.nextInt();
        boolean Function = isPrime(input);
        if (Function == true) {
            System.out.println("The number "+input+" is Prime !");
        }
        else {
            System.out.println("The number "+input+" is not a Prime !");
        }
    }
}
