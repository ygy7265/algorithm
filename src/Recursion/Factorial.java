package Recursion;

public class Factorial {
    public static void main(String[] args) {
        int result = factorial(4);
        System.out.println("result = " + result);
    }

    public static int factorial(int n) {
        if (n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

}
