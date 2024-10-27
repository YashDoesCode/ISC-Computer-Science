package ISC_XI_Computer_Science;

import java.util.*;
class program2
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int roll[]=new int[10];
        System.out.println("enter 20 roll numbers");
        for(int i=0;i<10;i++)
        {
            roll[i]=sc.nextInt();
        }System.out.println("enter the roll number to search");
        int n=sc.nextInt();int f=0;
        for(int i=0;i<10;i++)
        {
            if(n==roll[i])
            {
                f=1;
                break;
            }
        }if(f==1)
        {
            System.out.println("Search successful");
        }else
        {
            System.out.println("search unsuccessful");
        }}}//program is correct
