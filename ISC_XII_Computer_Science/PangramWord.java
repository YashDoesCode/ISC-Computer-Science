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
                    if (input.charAt(input.length() - 1) == '.' || input.charAt(input.length() - 1) == '!' || input.charAt(input.length() - 1) == '?') {
                        System.out.println("Sentence: " + sentence.trim());
                        return;
                    } else {
                        System.out.println("INVALID INPUT");
                        sentence = "";
                        return;
                    }
                }
            }
            sentence += input + " ";
        }
    }

    public void isPangram() {
        boolean[] alphabet = new boolean[26];
        String Long = "", Short = "";
        boolean hasLetters = false;
        int wordStart = 0, len = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char store = sentence.charAt(i);

            if (store == ' ' || store == '.' || store == '!' || store == '?') {
                if (len > 0) {
                    String word = sentence.substring(wordStart, wordStart + len);

                    if (Long.length() < word.length()) {
                        Long = word;
                    }
                    if (Short.length() == 0 || Short.length() > word.length()) {
                        Short = word;
                    }

                    for (int k = 0; k < word.length(); k++) {
                        char ch = Character.toLowerCase(word.charAt(k));
                        if (ch >= 'a' && ch <= 'z') {
                            alphabet[ch - 'a'] = true;
                            hasLetters = true;
                        }
                    }
                    len = 0;
                }
            } else {
                if (len == 0) {
                    wordStart = i;
                }
                len++;
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
                System.out.println("IT IS A PANGRAM LONGEST WORD: " + Long + " SHORTEST WORD: " + Short);
            } else {
                System.out.println("IT IS NOT A PANGRAM LONGEST WORD: " + Long + " SHORTEST WORD: " + Short);
            }
        } else {
            System.out.println("INVALID INPUT");
        }
    }

    public static void main(String[] args) {
        PangramWord obj = new PangramWord();
        obj.accept();
        obj.isPangram();
    }
}
