import java.util.Scanner;

class Special {
    int n;

    public Special() {
        n = 0;
    }

    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = scanner.nextInt();
    }
    public int factorial(int x) {
        if (x == 0 || x == 1) {
            return 1;
        } else {
            return x * factorial(x - 1);
        }
    }
    public boolean isSpecial() {
        int originalNumber = n;
        int sumOfFactorials = 0;

        while (n > 0) {
            int digit = n % 10;
            sumOfFactorials += factorial(digit);
            n /= 10;
        }

        return sumOfFactorials == originalNumber;
    }
    public void display() {
        if (isSpecial()) {
            System.out.println("The number is a Special number.");
        } else {
            System.out.println("The number is not a Special number.");
        }
    }

    public static void main(String[] args) {
        Special specialNumber = new Special();
        specialNumber.read();
        specialNumber.display();
    }
}