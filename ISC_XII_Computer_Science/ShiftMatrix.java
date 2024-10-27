package ISC_XII_Computer_Science;

import java.util.Scanner;

public class ShiftMatrix{
    public static void main (String [] args){
        Scanner scanner = new Scanner  (System.in);
        
        System.out.println("Enter the dual size of the Matrix (mxn): ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        int arr[][]= new int [m][n];
        System.out.println("Enter Array elements: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        
        int [] row=arr[0];
        
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=row;
        
        System.out.println("Array after Shifting: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        
        int max = arr[0][0];  
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];  
                }
            }
        }
        System.out.println("Max Value in Array: "+max);
    }
}
