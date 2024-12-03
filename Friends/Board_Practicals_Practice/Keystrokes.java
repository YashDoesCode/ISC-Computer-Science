package Friends.Board_Practicals_Practice;

import java.util.Scanner;

public class Keystrokes{
  public static void main (String [] args){
    Scanner scanner = new Scanner (System.in);
    
    String Alphabets[]={"1","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"," "};
    String Numerics[]={"1","2","3","4","5","6","7","8","9","0"};
    
    System.out.println("Input a Sentence to count: ");
    String sentence = scanner.nextLine().toUpperCase();
    int frequency=0;
    
    for(int k=0;k<sentence.length();k++){
      char extract = sentence.charAt(k);
      
      if(!Character.isDigit(extract) && !Character.isLetter(extract)){
        System.out.println("Invliad Input"+"\nPlease Enter again!");
        System.exit(0);
      }
      
      for(int l=0;l<Alphabets.length;l++){
        int counter = Alphabets[l].indexOf(extract);
        
        if(counter!=-1){
          frequency +=(counter+1);
          break;
        }
      }
    }
    System.out.println("Frequency of Keystrokes: "+frequency);
  }
}
