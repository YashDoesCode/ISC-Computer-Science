import java.util.*;
class CyclicShift
{
    void shift(int a[][], int m, int n)
    {
        int t[]=new int[n];
        for(int i=0; i<n; i++)
            t[i]=a[0][i];
        for(int i=0; i<m-1; i++)
            for(int j=0; j<n ; j++)
                a[i][j]=a[i+1][j];
        for(int i=0; i<n; i++)
        a[m-1][i]=t[i];
    }
    void display(int a[][], int M, int N)
    {
        for(int i=0; i<M; i++)
        {
            for(int j=0; j<N; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
    public static void main()
    {
        Scanner as = new Scanner(System.in);
        CyclicShift obj = new CyclicShift();
        System.out.print("M = ");
        int M=as.nextInt();
        System.out.print("N = ");
        int N=as.nextInt();
        int a[][]=new int[M][N];
        int max=0; int r=0; int c=0;
        System.out.println("Enter elements of the matrix");
        for(int i=0; i<M; i++)
        {    for(int j=0; j<N; j++)
              {
                  a[i][j]=as.nextInt();
                  if(a[i][j]>max)
                  { 
                      max=a[i][j];
                      r=i; c=j;
                  }
              }
        }
        obj.display(a,M,N);
        obj.shift(a,M,N);
        System.out.println("MODIFIED MATRIX:");
        obj.display(a,M,N);
        System.out.println("Highest element: " + max + " (Row: " + r+" and Column: " + c+")");
    }
}