package ISC_XI_Computer_Science;

public class DecimalEquivalent {
    public static void main (String [] args) {

    int [][] arr = {{1,0,0,1},{0,1,0,1},{1,1,1,0},{1,1,1,1}};

    System.out.println("Original Array: ");

     printArray(arr);

    System.out.println("Row-wise Decimal equivalent : ");

    for (int i =0;i<arr.length;i++) {
        int s=0;
        for (int j=0;j<arr.length;j++) {
             s += arr[i][j]*(int)Math.pow(2,3-j);
        }
        System.out.print(s + " ");
    }

    System.out.println("\n"+"Column-wise Decimal equivalent : ");

    for (int i =0;i<arr.length;i++) {
        int s=0;
        for (int j=0;j<arr.length;j++) {
             s += arr[j][i]*(int)Math.pow(2,3-j);
        }
        System.out.println(s);
    }
}
  public static void printArray(int[][] Array) {
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array.length; j++) {
                System.out.print(Array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
