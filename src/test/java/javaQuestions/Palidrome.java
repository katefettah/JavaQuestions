package javaQuestions;

import java.util.Scanner;

public class Palidrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Check the string is palindrome or not");
        String s=sc.nextLine();
        palindrome(s);

    }

    public static void palindrome(String s){
        String rs="";

        for(int i=s.length()-1;i>=0;i--){
            rs+=s.charAt(i);
        }
        if(s.equals(rs)) {
            System.out.println("palindrom");
        }else {
            System.out.println("not palindrom");
        }
    }
}
