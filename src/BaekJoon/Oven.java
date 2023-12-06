package BaekJoon;

import java.util.Scanner;

public class Oven {


    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String input = a.nextLine();
        int cookMn = a.nextInt();

        String[] sp = input.split(" ");
        int time = Integer.parseInt(sp[0]);
        int mn = Integer.parseInt(sp[1]) + cookMn;

        if(mn >= 60){
            int multi = mn / 60;
            time += multi;
            mn -= multi*60;
            if(time > 23){
                time -= 24;
            }
        }
        System.out.print(time+" "+mn);

    }

}
