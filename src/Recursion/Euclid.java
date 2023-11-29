package Recursion;

public class Euclid {
    public static void main(String[] args) {
        int result = euclid(4,6);
        System.out.println("result : " + result);
    }

    public static int euclid(int a, int b){
        if(b==0)
            return a;
        else
            return euclid(b,a%b);
    }
}
