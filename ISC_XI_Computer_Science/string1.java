package ISC_XI_Computer_Science;

import java.util.*;
class string1
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner (System.in);
        String s,v="";
        System.out.println("enter a word");
        s=sc.nextLine();
        int l=s.length();
        for(int i=l-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            v=v+ch;
        }if(s.equals(v))
        
           
            System.out.println("it is a pallindrome");
            else
            System.out.println("it is not a pallindrome");
        
        
    }
}//program is correct
