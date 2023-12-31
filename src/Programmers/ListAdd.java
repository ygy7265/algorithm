package Programmers;

import java.util.*;
import java.util.stream.Stream;

public class ListAdd {

    public static void main(String[] args) {
        int result = gcd(10,5);
        int result2 = lcm(10,2);
        int result3 = lcm(10,2);
        System.out.println("gcd :" + result);
        System.out.println("gcd :" + result2);
        System.out.println("gcd :" + result3);
    }
    static int gcd(int a, int b){
        if(b == 0)
            return a;
        return gcd(b, a%b);
    }
    static int lcm(int a,int b){
        return a*b / gcd(a,b);
    }

    public int solution(int[] num_list, int n) {
        int answer = 0;
        for (int num : num_list) {
            if (num == n)
                return 1;
        }
        return answer;
    }

    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 == 0) {
                answer[i] = strArr[i].toLowerCase();
            } else if (i % 2 == 1) {
                answer[i] = strArr[i].toUpperCase();
            }
        }
        return answer;
    }

    public int[] solution2(int[] num_list, int n) {
        List<Integer> list = new ArrayList();

        for (int i = n; i < num_list.length; i++) {
            list.add(num_list[i]);
        }

        for (int i = 0; i < n; i++) {
            list.add(num_list[i]);
        }
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }

    public String solution3(String my_string, String alp) {
        String answer = "";
        char[] myChar = my_string.toCharArray();
        for (char my : myChar) {
            String myString = my + "";
            if (myString.equals(alp)) {
                myString = myString.toUpperCase();
            }
            answer += myString;
        }
        return answer;
    }

}
