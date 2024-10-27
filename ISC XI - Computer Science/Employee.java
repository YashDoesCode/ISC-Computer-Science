import java.util.Scanner;

public class Employee {
    String name;
    int pan;
    double taxincome,tax;
    
    Employee () {
        name ="";
        pan=0;
        taxincome=0.0;
        tax =0.0;
    }
    void input() {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the name");
        name = in.nextLine();
        System.out.println("Enter Pan number");
        pan = in.nextInt();
        System.out.println("Enter the Tax income");
        taxincome=in.nextDouble();
    }
    void call() {
        if(taxincome<=250000) {
            tax =0;
        }
        else if(taxincome<=250000 && taxincome<=500000) {
            tax = (taxincome -250000)*0.1;
        }
        else if(taxincome >500000 && taxincome <= 1000000) {
            tax = 10000 + 0.2*(taxincome - 500000);
        }
        else{
            tax = 25000 + 0.3*(taxincome -1000000);
        }
    }
    void display() {
        System.out.println("Pan number : "+pan+"\n Name : "+name + "\n taxincome : " + taxincome + " \n tax : "+tax);
    }
    public static void main (String [] args) {
        Employee emp = new Employee();
        emp.input();
        emp.call();
        emp.display();
    }
}