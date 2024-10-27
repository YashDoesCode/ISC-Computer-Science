import java.util.Scanner;

class Perfect {
    int num;

    public Perfect(int nn) {
        num = nn;
    }

    public int sum_of_factors(int i) {
        if (i == 1) {
            return 1;
        }
        if (num % i == 0) {
            return i + sum_of_factors(i - 1);
        }
        return sum_of_factors(i - 1);
    }

    public void check() {
        int sum = sum_of_factors(num - 1); // Start from num-1 to exclude itself
        if (sum == num) {
            System.out.println(num + " is perfect.");
        } else {
            System.out.println(num + " is not perfect");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's perfect: ");
        int numberToCheck = scanner.nextInt();
        
        Perfect perfectNumber = new Perfect(numberToCheck);
        perfectNumber.check();
    }
}