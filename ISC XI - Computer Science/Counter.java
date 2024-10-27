import java.util.Scanner;

public class Counter {
    private char[] guest;
    private int count;

    public void acceptGuestList() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the guest list: ");
        guest = input.next().toCharArray();
    }

    private void incCount() {
        count++;
    }

    private int giveCount() {
        return count;
    }

    private void displayCount() {
        int ladies = 0, gentlemen = 0, children = 0;
        for (char c : guest) {
            switch (c) {
                case 'l':
                    ladies++;
                    break;
                case 'g':
                    gentlemen++;
                    break;
                case 'c':
                    children++;
                    break;
            }
        }
        System.out.println("Number of ladies: " + ladies);
        System.out.println("Number of gentlemen: " + gentlemen);
        System.out.println("Number of children: " + children);
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.acceptGuestList();
        counter.displayCount();
    }
}