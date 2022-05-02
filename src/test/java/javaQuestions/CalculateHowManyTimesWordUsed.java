package javaQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CalculateHowManyTimesWordUsed {
    /*
	 Ask user to enter a String.
	 Create a method to see which word is used how many times?
	*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();

        Map<String,Integer> map=new HashMap<>();
        String arr[]=str.split(" ");

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr)){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        System.out.println(map);
    }


}
