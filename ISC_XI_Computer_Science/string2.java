package ISC_XI_Computer_Science;

import java.util.*;
class string2
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner (System.in);
        String s,v="",a="aeiouAEIOU";
        System.out.println("enter a word");
        s=sc.nextLine();
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(a.indexOf(ch)!=-1)
            v=ch+v;
            else
            v=v+ch;
        }System.out.println(v);}}//correct program
