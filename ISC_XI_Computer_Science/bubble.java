package ISC_XI_Computer_Science;

import java.util.*;
class bubble{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        System.out.println("enter 10 numbwrs");
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }int t;
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
    System.out.println("sorted array is");
    for(int i=0;i<10;i++)
    {
        System.out.println(arr[i]);
    }
}}//program is correct
