package javaQuestions;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Check the numbers whether prime or not");
        int num=sc.nextInt();
        prime(num);
    }
    public static void prime(int num){

        int count=0;
        if(num>0){
            if(num==1){
                System.out.println(num+" is a prime number");
            }else{
                for(int i=2;i<num;i++) {
                    if (num % i == 0) {
                        count++;
                    }
                }
                    if(count==0){
                        System.out.println(num+" is a prime");
                    }else{
                        System.out.println(num+" is not a prime");

                }
            }
        }else {
            System.out.println("use positive number");
        }
    }
}
