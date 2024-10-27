import java.util.Scanner;

public class Anagram {
        public static boolean isAnagram(String str1, String str2) {
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (ch != ' ') {
                if (ch >= 'A' && ch <= 'Z') {
                    ch = (char) (ch + 'a' - 'A'); 
                }
                count1[ch - 'a']++; 
            }
        }
        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            if (ch != ' ') {
                if (ch >= 'A' && ch <= 'Z') {
                    ch = (char) (ch + 'a' - 'A');
                }
                count2[ch - 'a']++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) {
                return false; 
            }
        }
        return true;
    }
    public static boolean isValid(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') { 
                if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))) {
                    return false; 
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 2 statements: ");
        String str1 = scanner.nextLine(),str2 = scanner.nextLine();
        if (!isValid(str1) || !isValid(str2)) {
            System.out.println("Invalid");
        } else if (isAnagram(str1, str2)) {
            System.out.println("Anagram Found !");
        } else {
            System.out.println("No Anagram Found !");
        }
    }
}