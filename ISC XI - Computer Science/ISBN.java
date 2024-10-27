import java.util.Scanner;

public class ISBN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to check : ");
        String input = scanner.nextLine();
        String s = input.toUpperCase();

        if (s.length() == 10) {
            int sum = 0;
            int multiplier = 10;

            for (int i = 0; i < 10; i++) {
                if (s.charAt(i) == 'X' && i == 9) {
                    sum += 10;
                } else if (Character.isDigit(s.charAt(i))) {
                    sum += multiplier * (s.charAt(i) - '0');
                    multiplier--;
                } else {
                    System.out.println("Invalid character in ISBN.");
                    return;
                }
            }

            System.out.println("Sum : " + sum);

            if (sum % 11 == 0) {
                System.out.println("ISBN Encountered !");
            } else {
                System.out.println("Invalid ISBN !");
            }
        } else {
            System.out.println("Invalid ISBN length. Should be 10 digits.");
        }
    }
}
