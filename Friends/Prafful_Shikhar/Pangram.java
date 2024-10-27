package Friends.Prafful_Shikhar;

import java.util.*;

class Pangram
{
    static String s;
    Pangram()
    {
        s="";
    }
    static String bubsort(String s)
    {
        s=s.replace(" ","");
        char a[]=new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            a[i]=ch;
        }
        char temp='\u0000';
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        return String.valueOf(a);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("INPUT :");
        String s=sc.nextLine().toUpperCase();
        s=bubsort(s);
        int c=0,freq=0;
        String Alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i=0;i<Alphabet.length();i++)
        {
            char ch=Alphabet.charAt(i);
            c=0;
            for(int j=0;j<s.length();j++)
            {
                char ch1=s.charAt(j);
                if(ch==ch1)
                c++;
            }
            if(c>0)
            {
                freq++;
            }
        }
        if(freq==26)
        {
            System.out.println("It is a Pangram");
        }
        else
        {
            System.out.println("It is not a Pangram");
        }
    }
}
