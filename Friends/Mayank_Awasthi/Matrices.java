package Friends.Mayank_Awasthi;

import java.util.*;

class Matrices
{
    boolean isSymmetric(int[][] A,int M)
    {
        for(int i=0; i<M; i++)
        {
            for(int j=0; j<i; j++)
            if(A[i][j]!=A[j][i])
            return false;
        }
        return true;
    }
    int sumleft(int[][] A, int M)
    { int s=0;
        for(int i=0; i<M; i++)
        {
            for(int j=0; j<M; j++)
            {
                if(i==j)
                s=s+A[i][j];
            }
    }
    return s;
    }
    int sumright(int[][] A, int M)
    { int s=0;
        for(int i=0; i<M; i++)
        {
            for(int j=0; j<M; j++)
            {
                if(j==(M-i-1))
                s=s+A[i][j];
            }
    }
    return s;
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        Matrices obj = new Matrices();
        System.out.println("Enter the order of the matrix");
        int M=sc.nextInt();
        if(M<=2 || M>=10)
        {
            System.out.println("INVALID INPUT");
            System.exit(0);
        }
        int A[][]=new int[M][M];
        System.out.println("Enter the elements of the array");
        for(int i=0; i<M; i++)
            for(int j=0; j<M; j++)
            A[i][j]=sc.nextInt();
            System.out.println("ORIGINAL MATRIX");
        for(int i=0; i<M; i++)
        {    for(int j=0; j<M; j++)
            System.out.print(A[i][j]+" ");
            System.out.println();}
        if(obj.isSymmetric(A,M))
        System.out.println("THE GIVEN MATRIX IS SYMMETRIC");
        else
        System.out.println("THE GIVEN MATRIX IS NOT SYMMETRIC");
        System.out.println("Sum of left Diagonal: "+obj.sumleft(A,M));
        System.out.println("Sum of right Diagonal: "+obj.sumright(A,M));
    }
}
