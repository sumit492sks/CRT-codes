package Strings;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean p = palindrome(s);
        System.out.println(p);
        
    }

    static String reverse(String s){
        String r = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            r = ch+r;
        }
        return r;
    }

    static boolean palindrome(String s){
        String rev = reverse(s);
        System.out.println(rev);
        int flag=1;
        for(int i=0;i<s.length();i++){
            char ch1 =s.charAt(i);
            char ch2 = rev.charAt(i);
            if(ch1!=ch2)
                flag=0;
        }
        return (flag==1);
    }
}
