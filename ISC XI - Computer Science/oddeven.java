import java.util.Scanner;
class oddeven
{
    public static void main(String[]args)
    {
        Scanner sc =new Scanner (System.in);
        int c1=0;
        int c2=0;
        System.out.println("enter any integer");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                if(i%2==0)
                {
                    c1++;
                } else
                
                {
                    c2++;
                }
            }
        }
        System.out.println("no. of even factors are"+c1);
        System.out.println("no. of odd factors are"+c2);
    }}//correct program
        
    
        
        