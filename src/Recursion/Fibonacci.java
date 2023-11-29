package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int result = fibonacci(5);

        System.out.println("result : " + result);
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
