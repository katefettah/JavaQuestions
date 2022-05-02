package javaQuestions;

import java.util.Scanner;

public class CountOfTheWordsAndLetters {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("write the string");
        String str=sc.nextLine();
        countOfWords(str);
        countOfLetters(str);
    }

    public static void countOfWords(String str){
        String arr[]=str.split(" ");
        System.out.println("Count of the words "+"="+arr.length);
    }

    public static void countOfLetters(String str){
        String str1=str.replaceAll(" ","");
        System.out.println(str1);
        System.out.println("count of the letters"+"="+str1.length());
    }


}
