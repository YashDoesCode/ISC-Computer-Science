package ISC_XII_Computer_Science;

import java.util.*;
class Goldbach
{
    boolean isPrime(int n)
    {
        for(int i=2; i<=n/2; i++)
            if(n%i==0)
                return false;
        return true;
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        Goldbach obj = new Goldbach();
        System.out.print("N = ");
        int N=sc.nextInt();
        if(N%2==1)
        {
            System.out.println(N+ " is an Odd number. Invalid Input");
            System.exit(0);
        }
        if(N<1 || N>50)
        {
            System.out.println("INVALID INPUT");
            System.exit(0);
        }
        System.out.print("ODD PRIME PAIRS ARE:    ");
        for(int i=3;i<=N/2; i=i+2)
        {	
            if(obj.isPrime(i) && obj.isPrime(N-i))
            {   
                System.out.print(i +", " + (N-i));
                System.out.print("\n\t\t\t");
            }
        }
        System.out.println();
    }
}