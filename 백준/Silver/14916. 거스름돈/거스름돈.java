import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[100001];

        dp[1] = -1;
        dp[2] = 1;
        dp[3] = -1;
        dp[4] = 2;
        dp[5] = 1;
        dp[6] = 3;
        dp[7] = 2;
        dp[8] = 4;

        for (int i = 9; i <= N; i++) {
            dp[i] = Math.min(dp[i - 2] + 1, dp[i - 5] + 1);
        }

        System.out.println(dp[N]);
    }
}