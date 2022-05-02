package javaQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class DifferenceBetweenBiggestAndSmallestNumberOfArray {
    /*
	 Create a function that takes an array and returns the difference between the biggest and the smallest numbers.
	 Ask user to enter array elements.
	*/

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int length=sc.nextInt();
        int arr[]=new int[length];

        System.out.println("enter the array elements");
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-1]-arr[0]);


    }

}
