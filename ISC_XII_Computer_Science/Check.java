package ISC_XII_Computer_Science;

import java.util.Scanner;

public class Check {
    String wrd;
    int len;

    public Check() {
        wrd = "";
        len = 0;
    }
    public void acceptWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        wrd = scanner.nextLine();
        len = wrd.length();
    }
    public boolean isPalindrome() {
        for (int i = 0; i < len / 2; i++) {
            if (wrd.charAt(i) != wrd.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public void display() {
        if (isPalindrome()) {
            System.out.println(wrd + " is a palindrome.");
        } else {
            System.out.println(wrd + " is not a palindrome.");
        }
    }
    public static void main(String[] args) {
        Check c = new Check();
        c.acceptWord();
        c.display();
    }
}
