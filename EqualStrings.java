package Strings;

import java.util.Scanner;

public class EqualStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        
        System.out.println(equal(s1, s2));

    }

    static boolean equal(String s1,String s2){
        int flag=1;
        if(s1.length() == s2.length()){
            for(int i=0;i<s1.length();i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            
            if(ch1!=ch2)
                flag=0;
             }
        }return (flag==0);
    }
}
