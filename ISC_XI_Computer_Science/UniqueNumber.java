package ISC_XI_Computer_Science;

import java.util.Scanner;
public class UniqueNumber
{
    public static void main (String[]args)
    {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the Number to check");
        int n = scanner.nextInt();
        String con = n +"";
        boolean ch =true;
        for (int i=0; i<con.length();i++)
        {
            if (con.indexOf(con.charAt(i),i+1) > -1)
            {
                ch = false;
                break;
            }
        }
        if (ch == true){
            System.out.println("Unique");
        }
        else {
            System.out.println("Sorry, Not Unique");
        }
    }
}
