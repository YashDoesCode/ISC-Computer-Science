package ISC_XII_Computer_Science;

import java.util.Scanner;

public class Toggle {
    String str;
    String newstr;
    int len;
    public Toggle() {
        str = "";
        newstr = "";
        len = 0;
    }
    public void readWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        str = scanner.nextLine();
        len = str.length();
    }
    public void toggle() {
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                newstr += Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                newstr += Character.toUpperCase(ch);
            } else {
                newstr += ch; 
            }
        }
    }
    public void display() {
        System.out.println("Original word: " + str);
        System.out.println("Toggled word: " + newstr);
    }
    public static void main(String[] args) {
        Toggle t = new Toggle();
        t.readWord();
        t.toggle();
        t.display();
    }
}
