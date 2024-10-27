import java.util.*;
class college {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);

        int month[]={0,31,28,31,30,31,30,31,31,30,31,30,31};

        System.out.println("Enter Date,Months and years");

        int dd=sc.nextInt();
        int mm=sc.nextInt();
        int y=sc.nextInt();
        String s="";
        s=s+y;

        if(s.length()==4) {
          if(mm>=1&&mm<=12) {
              if(dd>=1&&dd<=month[mm]) {
                  System.out.println("Enter number of days");
                  int n=sc.nextInt();int k=-1;
                  int a=n;
                  while(k<0) {
                     a=dd-a;
                    if(a<0) { mm=mm-1;
                     dd=month[mm];
                     if(mm<1) {
                         y=y-1;
                     }k=a;
                     a=Math.abs(a);
                     }
                  }
                 System.out.println("project allottment date="+a+"/"+mm+"/"+y);
              }
          }
 }
}
}