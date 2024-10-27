package ISC_XI_Computer_Science;

import java.util.Scanner;

public class AnalogTimeSystem{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input: Time ");
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        
        if (hour < 1 || hour > 12 || minute < 0 || minute > 59) {
            System.out.println("Invalid input. Please enter valid values.");
            return;
        }
        
        String[] numbers = {
            "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", 
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
        };
        
        String[] tens = {
            "", "", "Twenty", "Thirty", "Forty", "Fifty"
        };
    
        String hourInWords = numbers[hour];
        
        String minuteInWords;
        if (minute == 0) {
            minuteInWords = "O’ Clock";
        } else if (minute == 15) {
            minuteInWords = "Quarter past " + hourInWords;
        } else if (minute == 30) {
            minuteInWords = "Half past " + hourInWords;
        } else if (minute == 45) {
            hourInWords = numbers[hour + 1]; // Increment hour for "quarter to"
            minuteInWords = "Quarter to " + hourInWords;
        } else if (minute < 20) {
            minuteInWords = numbers[minute] + " minutes past " + hourInWords;
        } else {
            minuteInWords = tens[minute / 10] + " " + numbers[minute % 10] + " minutes past " + hourInWords;
        }
        
        System.out.println("Output: " + hour + ":" + (minute < 10 ? "0" : "") + minute + " " + minuteInWords);
        scanner.close();
    }
}
