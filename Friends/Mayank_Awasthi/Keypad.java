package Friends.Mayank_Awasthi;

import java.util.*;

class Keypad
{
    boolean isValid(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            if(!(Character.isLetter(s.charAt(i))))
            return false;
        }
        return true;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        Keypad obj=new Keypad();
        System.out.println("Enter a word");
        String s=sc.next();
        if(!(obj.isValid(s)))
        {
            System.out.println("Invalid input");
            System.exit(0);
        }
        s=s.toUpperCase();
        String w[]={" ","","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
        int keyStrokes=0;
        for(int i=0;i<s.length();i++)
            for(int j=0;j<w.length;j++)
                if(w[j].indexOf(s.charAt(i))!=-1)
                keyStrokes+=w[j].indexOf(s.charAt(i))+1;
        System.out.println("Number of Keystrokes = "+keyStrokes);
    }
}
