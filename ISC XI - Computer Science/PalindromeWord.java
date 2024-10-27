import java.util.Scanner;

public class PalindromeWord {
    static boolean isPalindrome (String input){
        String reverse ="";

        for(int i=input.length() - 1;i>=-0;i--){
            reverse += input.charAt(i);
        }
        if(input.equalsIgnoreCase(reverse)){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter a number/word for check for its validity as Palindrome : ");
        String input = scanner.next();

        if (isPalindrome(input)){
            System.out.println("Palindrome Detected !");
    }
        else {
            System.out.println("Bad Palindrome !");
        }
    }
}