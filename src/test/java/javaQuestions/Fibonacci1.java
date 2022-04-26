package javaQuestions;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        int N=10;
        for(int i=0;i<=10;i++){
            System.out.print(fib(i)+" ");
        }

    }

    static int fib(int n){
        if(n<=1)
            return n;
            return fib(n-1)+fib(n-2);


    }

}

