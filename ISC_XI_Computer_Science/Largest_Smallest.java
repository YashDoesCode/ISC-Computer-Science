package ISC_XI_Computer_Science;

import java.util.Scanner;
class Largest_Smallest
{
    public static void main(String[]args)
    {
        Scanner sc =new Scanner (System.in);
        System.out.println("enter any multidigit number");
        int n=sc.nextInt();
        int ld=0,sd=10;
        while(n!=0)
        {
            int d=n%10;
            if(d>ld)
          {  ld=d;}
            if(d<sd)
           { sd=d;}
          n=n/10;  
        }System.out.println("largest digit"+ld);
        System.out.println("smallest digit"+sd);
    }
}
