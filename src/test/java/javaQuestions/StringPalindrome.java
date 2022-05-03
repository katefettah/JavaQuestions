package javaQuestions;

import java.util.Scanner;

public class StringPalindrome {
    /*
	 Ask user to enter a String
	 Check if it is palindrome or not. Its reverse will be same with the String itself, like 121 or abba
	*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();

        String rs="";

        for(int i=str.length()-1;i>=0;i--){
            rs+=str.charAt(i);
        }
        if(str.equals(rs)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }

    }
}
