import java.util.*;
class menudriven
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("menu");
        System.out.println("1.for printing the sum of series");
        System.out.println("2.for printing the pattern");
        System.out.println("enter your choice");
        int ch=sc.nextInt();
        switch(ch)
        {
            
              case 1:
                 System.out.println("enter the value of x");
                 double x=sc.nextDouble();
                 System.out.println("enter number of terms");
                 int n=sc.nextInt();
                 double s=0.0D,d=0.0D, f=1.0;
                 for(int i=1;i<=n+n;i++)
                 { f=f*i;
                     if(i%2==1)
                     s=(s+(x/f));
                    else
                    d=d+(double)(x/f);
                }System.out.println("series sum="+s);
                break;
              case 2:
                  String S="",T="+",O="1",b="/";
                 System.out.println("enter the value of x");
                 int X=sc.nextInt();
                  for(int i=1;i<10;i++)
                  {
                      double g=(double)Math.pow(X,i+1);
                      String a=Double.toString(g);
                      S=S+O+b+a+T;
                    } System.out.println(S);
                    break;
                  default:
                      System.out.println("invalid choice");
 
        }
    }
}