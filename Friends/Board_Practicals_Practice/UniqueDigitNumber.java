package Friends.Board_Practicals_Practice;

import java.util.Scanner;

public class UniqueDigitNumber{
    public static boolean isUnique(int input,int array[]){
        if(input==0){
            return true;
        }
        int modulo = input%10;
        if(array[modulo]==1){
            return false;
        }
        array[modulo]++;
        return isUnique(input/10,array);
    }
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Input the Principle Range: ");
        int upperBound=scan.nextInt();
        int lowerBound=scan.nextInt();
        if(upperBound<0||lowerBound<0||upperBound>=30000||lowerBound>=30000||upperBound>lowerBound){
            System.out.println("Invalid Input"+"\nPlease Enter Again...");
            return;
        }
        int counter=0;
        boolean flag=false;
        for(int k=upperBound;k<=lowerBound;k++){
            int array[]=new int[10];
            if(isUnique(k,array)){
                if(flag){
                    System.out.print(", ");
                }
                System.out.print(k);
                counter++;
                flag=true;
            }
        }
        if(counter==0){
            System.out.println("Frequency: "+counter);
        }
    }
}
