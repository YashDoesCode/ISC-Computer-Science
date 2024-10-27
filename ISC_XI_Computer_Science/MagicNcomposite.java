package ISC_XI_Computer_Science;

import java.util.*;
class MagicNcomposite
{ boolean composite(int n)
   {       int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==2)
        return false;
        else 
        return true;
    }boolean magic(int n)
    {   while(n>9)
        {
            for(int i=1;i<10;i++)
            {   int s=0;
                while(n!=0)
                {
                    int r=n%10;
                    s=s+r;
                    n=n/10;
                }n=s;
            }
        }
        if(n==1)
        return true;
        else 
        return false;
    }public static void main(String[]args)
    {   Scanner sc=new Scanner(System.in);
        MagicNcomposite obj=new MagicNcomposite();
        System.out.println("Enter the value of M and N where M<N");
        int M=sc.nextInt();
        int N=sc.nextInt();
        if(M<N)
        {    int c=0;
            System.out.println("The Composite Magic Numbers are");
            for(int i=M;i<=N;i++)
            {
                if(obj.composite(i)==true && obj.magic(i)==true)
                {
                    System.out.print(i+" ");
                    c++;
                }
            } System.out.println("\n"+"Frequency ="+" "+c);
        }   else
        System.out.println("Invalid Input");
}
}
