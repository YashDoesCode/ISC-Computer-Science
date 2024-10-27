package ISC_XI_Computer_Science;

public class Composite {
     int[][] arr;
     int m;
     int n;

    public Composite(int mm, int nn) {
        m = mm;
        n = nn;
        arr = new int[m][n];
    }

    private boolean isComposite(int p) {
        if (p < 4) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(p); i++) {
            if (p % i == 0) {
                return true;
            }
        }
        return false;
    }

    public void fill() {
        int num = 4;
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < m; row++) {
                while (!isComposite(num)) {
                    num++;
                }
                arr[row][col] = num;
                num++;
            }
        }
    }

    public void display() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int m = 4; 
        int n = 4; 

        Composite composite = new Composite(m, n);
        composite.fill();
        composite.display();
    }
}
