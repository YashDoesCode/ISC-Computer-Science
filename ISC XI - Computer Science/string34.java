import java.util.*;
class string34
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner (System.in);
        String s;
        System.out.println("Enter a word");
        s=sc.nextLine();s=s.toLowerCase();
        int l=s.length();
        for(char ch='a';ch<='z';ch++)
        {
            int c=0;
            for(int i=0;i<l;i++)
            {
                if(ch==s.charAt(i))
                c++;
            }
            if(c!=0)
            System.out.println(ch+"\t"+c);
        
        }
    }
}