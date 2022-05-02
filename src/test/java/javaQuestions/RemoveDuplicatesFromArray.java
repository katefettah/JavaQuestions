package javaQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,5,6,6};
       removeduplicates(arr,1);
    }
    public static int removeduplicates(int arr[], int n){
        if (n == 0 || n == 1) {
            return n;
        }
        Arrays.sort(arr);
        int j = 0;
        for ( int i = 0; i < n ; i++) {
            if (arr[i] != arr[i-1]) {
                arr[++j] = arr[i];
            }
        }
        return j;
    }
}
