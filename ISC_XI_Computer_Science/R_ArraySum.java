package ISC_XI_Computer_Science;

public class R_ArraySum {
    static int Sum(int a[], int l) {
        if (l == a.length - 1) {
            return a[l];
        } else {
            return a[l] + Sum(a, l + 1);
        }
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int sum = Sum(a, 0);
        System.out.println("Output : " + sum);
    }
}
