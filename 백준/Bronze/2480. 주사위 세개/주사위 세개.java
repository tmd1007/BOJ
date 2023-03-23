import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] dice = new int[7];
        int maxNum = 0;
        for (int i = 0; i < 3; i++) {
            int idx = Integer.parseInt(st.nextToken());
            dice[idx]++;
            if (maxNum < idx)
                maxNum = idx;
        }

        for (int i = 1; i < dice.length; i++) {
            if (dice[i] == 3){
                System.out.println(i * 1000 + 10000);
                break;
            } else if (dice[i] == 2){
                System.out.println(i * 100 + 1000);
                break;
            }
            if (i == 6)
                System.out.println(maxNum * 100);
        }

    }
}