package ISC_XI_Computer_Science;

import java.util.*;
class arraysum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int a[]=new int[10];
        int b[]=new int[10];
        int c[]=new int[20];

        System.out.println("enter 10 integers in first array");

        for(int i=0;i<10;i++) {
            a[i]=sc.nextInt();
        }
        System.out.println("enter 10 integers in second array");
        for( int i=0;i<10;i++) {
            b[i]=sc.nextInt();
        }
        //Assigning Arrays to Arrays.
        for(int i=0;i<10;i++) {
            c[i]=a[i];
        }
        for(int i=10;i<20;i++) {
            c[i]=b[i-10];
        }

        //Sorting Array C...
        for(int i=0;i<20-1;i++) {
            for(int j=0;j<20-i-1;j++) {
                if(c[j]>c[j+1]) {
                    int t=c[j];
                    c[j]=c[j+1];
                    c[j+1]=t;
                }
            }
        }

        System.out.println("Sorted array is=");

        for(int i=0;i<20;i++) {
            System.out.println(c[i]);
        }
    }
}
