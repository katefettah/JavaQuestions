package javaQuestions;

import java.util.Scanner;

public class Fibonacci3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("fomula the fibonecci numbers");
        int num=sc.nextInt();

        int f1 = 1;
        int f2 = 1;
        int fn = 0;
        System.out.print(f1 + " ");
        System.out.print(f2 + " ");

        for(int i=0;i<=num-2;i++){
           fn=f1+f2;
           f1=f2;
           f2=fn;
            System.out.println(fn+" ");

        }
    }
}
