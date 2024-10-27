package ISC_XI_Computer_Science;

import java.util.Scanner;
class prime
{
    public static void main(String[]args)
    {
        Scanner sc =new Scanner (System.in);
        System.out.println("enter any integer greater than 1");
        int n=sc.nextInt();
        boolean isPrime=true;
        if(n<=1)
        {
            isPrime=false;
        }else
        {
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                isPrime=false;
                break;
            }
            
        }
        
    }
    if(isPrime)
    {
        System.out.println(n+"is a prime number");
}else
{
    System.out.println(n+"is not a prime number");
    for(int i=1;i<=n;i++)
    {
        if(n%i==0)
        {
            System.out.println(i);
        }
    }
}
}}//correct program
