package Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        if(n < 2) {
            System.out.println(n);
        }else{
            for (int i=1; i<n; i++){
                c = a+b;
                a=b;
                b=c;
            }
            System.out.println(c);
        }
    }



    public static int fibonacci(int n){
        if(n < 2){
            return n;
        }
        else {
            return fibonacci(n-1) + fibonacci(n-2);
        }

    }
}
