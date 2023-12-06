package Recursion;

public class Recursion {
    public static void main(String[] args) {
        //charAt("NAVER");
        //binaryNumber(8);
        int[] data = {1,2,3,4,5};
        int result = sum(5);
        System.out.println("sum :" + result);

        int result1 = dataSum(4,data);
        System.out.println("dataSum :" + result1);

        int result2 = search(5,data,3);
        System.out.println("search : " + result2);

        int result3 = searchAfter(data,0,5,3);
        System.out.println("searchAfter :" + result3);
    }

     static void recursion() {
        System.out.println("Recursion Test");
        recursion();
    }

     static void charAt(String str) {
        if (str.length() == 0)
            return;
        else {
            System.out.println(str.charAt(0));
            charAt(str.substring(1));
        }
    }

    static void binaryNumber(int n){
        if(n < 2)
            System.out.println(n);
        else{
            binaryNumber(n/2);
            System.out.println(n%2);
        }
    }
    static int sum(int n){
        if(n <= 0)
            return n;
        else
            return sum(n-1)+n;
    }
    static int dataSum(int n,int[] data){
        if(n<=0)
            return n;
        else{
            return dataSum(n-1,data) + data[n-1];
        }
    }

    static int search(int n,int[] data,int target){
        for(int i=0; i<n;i++)
            if(data[i] == target)
                return i;

        return -1;
    }

    static int searchAfter(int[] data,int begin, int end, int target){
        if(begin>end)
            return -1;
        else if(data[begin] == target)
            return begin;
        else
            return searchAfter(data,begin+1,end,target);
    }
}
