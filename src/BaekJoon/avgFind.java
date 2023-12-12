package BaekJoon;

import java.util.Scanner;

public class avgFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String scores = sc.nextLine();

        String[] cScore = scores.split(" ");
        double max  = Integer.parseInt(cScore[0]);
        double iScore = 0;
        double sum = 0;
        for(String score : cScore){
             iScore = Double.parseDouble(score);
             sum += iScore;
            if(max < iScore){
                max = iScore;
            }
             System.out.println(max);
        }

        double avg = (sum * 100.0)/max;
        System.out.print(((sum /max) * 100.0)/N);

    }
}
