import java.util.*;
class program
{
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      int arr[]=new int[5];
      System.out.println("enter 5 numbers");
      for(int i=0;i<5;i++)
      {
          arr[i]=sc.nextInt();
      }int max=arr[0];int min=arr[0];
      for(int i=0;i<5;i++)
      {
          if(max<arr[i])
          {
             max=arr[i]; 
          }if(min>arr[i])
          {
              min=arr[i];
          }
      }System.out.println("maximun marks are");
      System.out.println("minimum marks are");
      for(int i=0;i<5;i++)
      {
          System.out.println(max);
          System.out.println(min);
      }}}//program is correct
      

    