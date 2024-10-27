package ISC_XI_Computer_Science;

public class AutomorphicNumber {
    public static boolean isAutomorphic(int n) {
        int square = n * n;
        String num = String.valueOf(n);
        String sq = String.valueOf(square);
        
        return sq.endsWith(num);
    }

    public static void main(String[] args) {
        int number = 76; 
        
        if (isAutomorphic(number)) {
            System.out.println("Automorphic");
        } else {
            System.out.println("Sorry, Not a Automorphic Number");
        }
    }
}
