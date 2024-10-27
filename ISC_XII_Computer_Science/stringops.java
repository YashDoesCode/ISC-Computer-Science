package ISC_XII_Computer_Science;

import java.util.*;
class stringops
{
    String str,msk,nstr;
    stringops()
    {
        str=" ";
        msk=" ";
        nstr=" ";
    }
    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the original");
        String s = sc.next();
        System.out.println("enter masked string");
        String m = sc.next();
        str = s.toLowerCase();
        msk = m.toLowerCase();
    }
    void form()
    {
        int l = str.length();
        int l1 = msk.length();
        for(int i=0;i<l;i++)
        {
            char x = str.charAt(i);
            if(msk.indexOf(x)==-1)
            nstr = nstr+x;
           
        }
    }
    void display()
    {
        System.out.println("original string:"+str);
        System.out.println("new string:"+nstr);
    }
    public static void main()
    {
        stringops obj = new stringops();
        obj.accept();
        obj.form();
        obj.display();
    }
}
