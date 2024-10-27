package ISC_XI_Computer_Science;

import java.util.*;
class series
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        int i,j,x,n;
        System.out.println("enter value of n and x");
        n=sc.nextInt();
        x=sc.nextInt();
        double s=0.0D;
        for(i=1;i<=n;i++)
        {
           s=s+Math.pow(x,i)/Math.pow(2,i); 
        }System.out.println(s);
    }}//correct program
