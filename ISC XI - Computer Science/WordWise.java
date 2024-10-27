import java.util.Scanner;

public class WordWise {
    String str;

    public WordWise() {
        str = "";
    }

    public void readSent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        str = scanner.nextLine();
    }

    public int freqVowel(String w) {
        int count = 0;
        w = w.toLowerCase();
        for (int i = 0; i < w.length(); i++) {
            char ch = w.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public void arrange() {
        String[] words = str.split("\\s+");
        for (String word : words) {
            int vowelCount = freqVowel(word);
            System.out.println("Word : " + word);
            System.out.println("Frequency of Vowels : "+ vowelCount);
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        WordWise wordWise = new WordWise();
        wordWise.readSent();
        wordWise.arrange();
    }
}