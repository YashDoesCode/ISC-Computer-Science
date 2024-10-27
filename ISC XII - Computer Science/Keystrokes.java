import java.util.Scanner;

public class Keystrokes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String comb[] = {"1","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"," "};
        String num[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" };
        
        System.out.println("Input a Sentence: ");
        String input = scanner.nextLine().toUpperCase();
        int flag = 0;
        
        for (int i = 0; i < input.length(); i++) {
            char store = input.charAt(i);
            if(!Character.isLetter(store) && !Character.isDigit(store)){
                System.out.println("Invalid Entry");
                System.exit(0);
            }
            for (int j = 0; j < comb.length; j++) {
                int cord = comb[j].indexOf(store);
                
                if (cord != -1) {
                    flag += (cord + 1);
                    break;
                }
            }
        }
        System.out.println("Number of Keystrokes: " + flag);
    }
}