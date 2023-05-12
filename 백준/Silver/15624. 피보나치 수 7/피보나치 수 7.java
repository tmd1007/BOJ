import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int mov = 1000000007;

        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[1000001];

        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= 1000000; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % mov;
        }

        System.out.println(dp[N]);
    }
}