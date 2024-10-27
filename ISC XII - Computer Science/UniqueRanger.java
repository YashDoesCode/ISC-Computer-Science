import java.util.Scanner;

public class UniqueRanger {
    public static boolean isUnique(int num, int[] n) {
        if (num == 0) {
            return true;
        }
        int store = num % 10;
        if (n[store] == 1) {
            return false;
        }
        n[store]++;
        return isUnique(num / 10, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        if (m < 0 || n < 0 || m >= 30000 || n >= 30000 || m > n) {
            System.out.println("Invalid Input");
            return;
        }
        int count = 0;
        boolean flag = false;
        System.out.print("Unique Numbers are: ");
        for (int i = m; i <= n; i++) {
            int[] arr = new int[10];
            if (isUnique(i, arr)) {
                if (flag) {
                    System.out.print(", ");
                }
                System.out.print(i);
                count++;
                flag = true;
            }
        }
        if (count == 0) {
        System.out.println("NIL"+ "\nFrequency of Digits: " + count);
        }
    }
}
