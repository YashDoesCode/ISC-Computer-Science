import java.util.Scanner;
class pallindrome
{
    public static void main(String[]args)
    {
        Scanner sc =new Scanner (System.in);
        System.out.println("enter any multidigit number");
        int n=sc.nextInt();
        int on=n;
        int rev=0;
        while(n!=0)
        {
           int r=n%10;
           rev=rev*10+r;
           n=n/10;
        }if(on==rev)
        {
            System.out.println("the no. is a pallindrome");
            
        }else
        {
            System.out.println("the no. is not a pallindrome");
        }}}