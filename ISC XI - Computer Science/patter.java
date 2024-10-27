import java.util.*;
class patter
{
    public static void main(String[]args)
    { Scanner sc=new Scanner(System.in);
        System.out.print("enter value of n");
        int n=sc.nextInt();
        double s=0.0D;double f=1;
        for(int i=1;i<=n;i++)
        {f=f*i;
            s=s+f/Math.sqrt(i+1);
        }System.out.println(" series sum"+s);
    }}