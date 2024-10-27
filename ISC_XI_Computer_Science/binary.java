package ISC_XI_Computer_Science;

import java.util.*;
class binary
{
   public static void main(String[]args)
   {
      Scanner sc=new Scanner(System.in);
      int roll[]=new int[10];
      System.out.println("enter roll no. of 10 students in ascending order");
      for(int i=0;i<10;i++)
      {
         roll[i]=sc.nextInt();
      }System.out.println("enter roll no. to search");
      int n=sc.nextInt();
      int lb=0,ub=9,mid=0,f=0;
      while(lb!=ub)
      {
          mid=(lb+ub)/2;
      if(n==roll[mid])
      {
          f=1;
          break;}
      if(n<roll[mid])
      
          ub=mid-1;
      if(n>roll[mid])
      
          lb=mid+1;
      }if(f==1)
      {
          
      System.out.println("search successful=1");
    }else
    {
        System.out.println("search unsuccessful");
    }
   }
}// program is correct
