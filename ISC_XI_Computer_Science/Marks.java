package ISC_XI_Computer_Science;

import java.util.*;
class Marks
{
    String name;
    int m1,m2,m3,m4,m5,max;
    float avg;
    Marks()
    {
        name="";
        m1=0;
        m2=0;
        m3=0;
        m4=0;
        m5=0;
        max=0;
        avg=0.0F;
    }void accept()
    {Scanner sc=new Scanner(System.in);
        System.out.println("enter name and marks of student in 5 subjects");
        name=sc.next();
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        m4=sc.nextInt();
        m5=sc.nextInt();
    }void compute()
    {
        avg=(m1+m2+m3+m4+m5)/5;
        max=Math.max(m1,(Math.max(m2,(Math.max(m3,(Math.max(m4,m5)))))));
        
    }void display()
    {
        System.out.println("Name of the student is="+name);
        System.out.println("marks of the student in 5 subjects are="+m1 +"\t"+m2+"\t"+m3+"\t"+m4+"\t"+m5);
        System.out.println("average marks are="+avg);
        System.out.println("maximum marks are="+max);
    }public static void main(String[]args)
    {
        Marks obj=new Marks();
        obj.accept();
        obj.compute();
        obj.display();
    }
}//correct program
