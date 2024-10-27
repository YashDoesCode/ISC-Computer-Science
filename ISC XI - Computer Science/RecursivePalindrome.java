import java.util.Scanner;
public class RecursivePalindrome {
    static int isPalindrome(int input, int temp) {
        if (input == 0) {
            return temp;
        }
        else {

            temp = (temp * 10) + (input % 10);
            return isPalindrome(input / 10, temp);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecursivePalindrome obj = new RecursivePalindrome();
        System.out.println("Enter the number to check : ");
        int input = scanner.nextInt();
        int temp = isPalindrome(input,0);
        if (input == temp) {
            System.out.println("The number " + input + " is Palindrome !");
        }
        else {
            System.out.println("The number "+ input +" is not a Palindrome !");
        }
    }
}