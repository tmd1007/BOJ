
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] score = new double[n];
        double max = 0;
        double total = 0;

        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
            if(max < score[i])
                max = score[i];
        }

        for (int i = 0; i <score.length; i++) {
            total += score[i]/max * 100;
        }

        System.out.println(total / n);
    }
}
