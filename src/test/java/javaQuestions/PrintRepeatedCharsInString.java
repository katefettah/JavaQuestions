package javaQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PrintRepeatedCharsInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        repeatedString(str);
    }
    public static void repeatedString(String str) {
        String arr[]=str.split("");
        HashMap<String, Integer>map=new HashMap<>();
        for (String w:arr) {
            if(map.containsKey(w)){
                map.put(w,map.get(w)+1);
            }else {
                map.put(w,1);
            }
        }
        Set<String>set=new HashSet<>();
        for(String w:arr){
            if(map.get(w)>1){
                set.add(w+"="+map.get(w));
            }
        }
        System.out.println(set);
    }
}
