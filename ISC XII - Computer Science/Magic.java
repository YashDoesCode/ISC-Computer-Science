import java.util.Scanner;

public class Magic {
     String str;
    public Magic() {
        str = "";
    }
    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word in UPPER case: ");
        str = in.nextLine();
    }
    public boolean check() {
        for (int i = 0; i < str.length() - 1; i++) {
            char currentChar = str.charAt(i);
            char nextChar = str.charAt(i + 1);
            if (nextChar - currentChar == 1 || nextChar - currentChar == -25) {
                return true;
            }
        }
        return false;
    }
    public void display() {
        if (check()) {
            System.out.println(str + " is a Magic word.");
        } else {
            System.out.println(str + " is not a Magic word.");
        }
    }
    public static void main(String[] args) {
        Magic m = new Magic();
        m.input();
        m.display();
    }
}
