package ISC_XII_Computer_Science;

import java.util.Scanner;

public class PangramWord {
    String sentence = "";

    public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence (end with '.', '!', or '?'):");

        while (true) {
            String input = scanner.nextLine();
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == '.' || input.charAt(i) == '!' || input.charAt(i) == '?') {
                    sentence += input;
                    System.out.println("Sentence: " + sentence.trim());
                    return;
                }
            }
            sentence += input + " ";
        }
    }

    public void isPangram() {
        boolean[] alphabet = new boolean[26];
        String longestWord = "", shortestWord = "";
        boolean hasLetters = false;
        int wordStart = 0, wordLength = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char store = sentence.charAt(i);

            if (store == ' ' || store == '.' || store == '!' || store == '?') {
                if (wordLength > 0) {
                    String word = sentence.substring(wordStart, wordStart + wordLength);

                    if (longestWord.length() < word.length()) {
                        longestWord = word;
                    }
                    if (shortestWord.length() == 0 || shortestWord.length() > word.length()) {
                        shortestWord = word;
                    }

                    for (int k = 0; k < word.length(); k++) {
                        char ch = Character.toLowerCase(word.charAt(k));
                        if (ch >= 'a' && ch <= 'z') {
                            alphabet[ch - 'a'] = true;
                            hasLetters = true;
                        }
                    }
                    wordLength = 0;
                }
            } else {
                if (wordLength == 0) {
                    wordStart = i;
                }
                wordLength++;
            }
        }

        boolean isPangram = true;
        for (boolean letter : alphabet) {
            if (!letter) {
                isPangram = false;
            }
        }

        if (hasLetters) {
            if (isPangram) {
                System.out.println("IT IS A PANGRAM LONGEST WORD: " + longestWord + " SHORTEST WORD: " + shortestWord);
            } else {
                System.out.println("IT IS NOT A PANGRAM LONGEST WORD: " + longestWord + " SHORTEST WORD: " + shortestWord);
            }
        } else {
            System.out.println("INVALID INPUT");
        }
    }

    public static void main(String[] args) {
        PangramWord meow = new PangramWord();
        meow.accept();
        meow.isPangram();
    }
}
