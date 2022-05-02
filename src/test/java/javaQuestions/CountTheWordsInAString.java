package javaQuestions;

import java.util.HashMap;

public class CountTheWordsInAString {
    public static void main(String[] args) {
        String str = "This is a string. This program is counting words in a string. ";
        String arr[]=str.split(" ");

        HashMap<String, Integer>hashMap=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(hashMap.containsKey(arr[i])){
                hashMap.put(arr[i],hashMap.get(arr[i])+1);
            }else{
                hashMap.put(arr[i],1);
            }
        }
        System.out.println(hashMap);
    }
}
