package ISC_XI_Computer_Science;

import java.util.*;
class buzzGc
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int c;
        
        
            System.out.println("menu");
            System.out.println("1. Check if it is a buzz number or not");
            System.out.println("2. Calculate the GCD of two numbers");
            System.out.println("3. exit");
            System.out.println("enter your choice");
            c=sc.nextInt();
            switch(c)
            {
                case 1:
                    System.out.println("enter a number");
                    int n=sc.nextInt();
                    if(n%7==0 || n%10==7)
                    {
                        System.out.println(n+"is a buzz number");
                    }
                    else
                    {
                    System.out.println(n+"is not a buzz number");
                    }break;
                case 2:
                    System.out.println("enter the firts number");
                   int n1=sc.nextInt();
                    System.out.println("enter the second number");
                    int n2=sc.nextInt();
                    while(n2!=0)
                    {
                        int t=n2;
                        n2=n1%n2;
                        n1=t;
                    }System.out.println("GCD is"+n1);
                    break;
                case 3:
                    System.out.println("exiting the program");
                    break;
                default:
                    System.out.println("invlid choice");
                }System.out.println();
                    
            
        }
    }
