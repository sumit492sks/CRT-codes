package Strings;

import java.util.Scanner;

public class HashVowels {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res ="";

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'||
             ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')
              res += "*";
            else
                res+= ch; 
        }
        System.out.println(res);
 }   
}

