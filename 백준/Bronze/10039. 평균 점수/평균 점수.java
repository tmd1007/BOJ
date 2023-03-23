import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] score = new int[5];
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            score[i] = Integer.parseInt(br.readLine());
            if (score[i] < 40){
                score[i] = 40;
            }
            sum += score[i];
        }

        System.out.println(sum / 5);
    }
}