package ISC_XII_Computer_Science;

import java.util.Scanner;

public class Anagram{
    public static boolean isAnagram(String one, String two){
        int count1[]=new int[26];
        int count2[]=new int[26];
        for(int i=0;i<one.length();i++){
            char store = one.charAt(i);
            if(store!=' '){
                if(store>='A' && store <='Z'){
                    store = (char)(store+'a'-'A');
                }
                count1[store-'a']++;
            }
        }
        for(int i=0;i<two.length();i++){
            char store = two.charAt(i);
            if(store!=' '){
                if(store>='A' && store <='Z'){
                    store = (char)(store+'a'-'A');
                }
                count2[store-'a']++;
            }
        }
        for(int i=0;i<26;i++){
            if(one.length()!=two.length()){
                System.exit(0);
            }
         }
        return true;
    }
    public static boolean isValid(String str){
        for(int i=0;i<26;i++){
            char store=str.charAt(i);
            if(store!=' '){
                if(!(store>='a' && store<='z')||!(store>='A' && store<='Z')){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String [] args){
        Scanner scanner = new Scanner (System.in);
        
        Anagram obj = new Anagram();
        System.out.println("Enter 2 String statements: ");
        String one=scanner.nextLine();
        String two = scanner.nextLine();
        
    }
}