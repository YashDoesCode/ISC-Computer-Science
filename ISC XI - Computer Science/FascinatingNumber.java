import java.util.Scanner;

public class FascinatingNumber {
    
  int Fascination(int n) {
      int f = 0, c = 0, i, j;
      
      String v = "123456789";
      String s = "";
      s = s + n + (n * 2) + (n * 3);
      
      for (i = 0; i < v.length(); i++) { 
          char ch = v.charAt(i);
          c = 0;
          for (j = 0; j < s.length(); j++) { 
              if (ch == s.charAt(j)) {
                  c++;
              }
          }
          if (c != 1) { 
              f = 1;
              break;
          }
      }
      if (f == 0)
          return 1;
      else
          return 0;
  }  
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      FascinatingNumber obj = new FascinatingNumber();
      int m, n, c = 0; 
      
      System.out.println("Enter the values separately in m & n Integer type variables");
      m = scanner.nextInt();
      n = scanner.nextInt();
      
      if (m > n || m <= 99 || n <= 99 || m > 10000 || n >= 10000) {
          System.out.println("ERROR INVALID RESPONSE");
      } else {
          for (int i = m; i <= n; i++) {
              if (obj.Fascination(i) == 1) {
                  c++;
                  System.out.println(i);
              }
          }
          System.out.println("The frequency of Fascinating Number is : " + c);
      }
  }
}