import java.util.*;
class twistedprime
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number ");
        int n=sc.nextInt();
        int rev=0;
        int f=0,p=0;
        while(n!=0)
        {
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        } for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            {
                f=1;
            }
        }if(f==0)
       { System.out.println("the number is prime");
        for(int y=2;y<rev/2;y++)
        {
            if(rev%y==0)
            {
                p=1;
            }
        }if(p==0)
        {
            System.out.println("the number is a twisted prime");
        }else
        System.out.println("the number is not  a twisted prime");
        
    }else
    System.out.println("the number is not prime please enter another number");
}}