package BaekJoon;

import java.util.Scanner;

public class addNumber {

    public static void main(String[] args) {
        //1 입력 받은값 저장
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String num = sc.next();

        int sum = 0;
        char[] cNums = num.toCharArray();

        for(char cNum : cNums){
            sum += cNum - '0';
            System.out.println(cNum+" "+ sum);
        }

        System.out.println(sum);
        //2.자르기

        //3.숫자 더하기
    }
}
