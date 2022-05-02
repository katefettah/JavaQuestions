package javaQuestions;

public class Fibonacci2 {

    public static void main(String[] args) {
        int N=10;
        for(int i=0;i<N;i++){
            System.out.println(fib(i)+" ");
        }

    }

    static  int fib(int n){
       int arr[]=new int [n+2];

       int i;
       arr[0]=0;
       arr[1]=1;

       for(i=2;i<=n;i++){
           arr[i]=arr[i-1]+arr[i-2];
       }
       return arr[n];
    }
}
