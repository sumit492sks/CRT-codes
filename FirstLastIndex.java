package Strings;

import java.util.Scanner;

public class FirstLastIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = sc.next().charAt(0);
        int f=0,l=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch){
                l = i;
             }       
         }
         for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch){
                f = i;
                break;
             }       
         }
                
        System.out.println("First Index: "+f);
        System.out.println("Last Index: "+l);
    }
}
