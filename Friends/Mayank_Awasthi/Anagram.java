package Friends.Mayank_Awasthi;

import java.util.*;

class Anagram
{
    boolean isValid(String s)
    {
        for(int i=0; i<s.length(); i++)
            if(!Character.isLetter(s.charAt(i)) && s.charAt(i)==' ')
            return false;
        return true;
    }
    String sort(String s)
    {
        String t="";
        for(int c='A'; c<'Z'; c++)
            for(int i=0; i<s.length(); i++)
            if(s.charAt(i)==c)
            t+=c;
        return t;
    }
    public static void main()
    {
        Scanner as = new Scanner(System.in);
        Anagram obj = new Anagram();
        System.out.println("Enter the first string: ");
        String a=as.nextLine();
        System.out.println("Enter the second string: ");
        String b=as.nextLine();
        if(!obj.isValid(a) || !obj.isValid(b))
        {
            System.out.println("INVALID ENTRY");
            System.exit(0);
        }
        if(obj.sort(a.toUpperCase()).equals(obj.sort(b.toUpperCase())))
        System.out.println("STRINGS ARE ANAGRAMS");
        else
        System.out.println("STRINGS ARE NOT ANAGRAMS");
    }
}
