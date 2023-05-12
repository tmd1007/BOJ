import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[1000001];

        dp[2] = 1;
        dp[3] = 1;

        for (int i = 4; i <= N; i++) {
            int min = Math.min(dp[i / 2], dp[i - 1]);
            if (i % 6 == 0) {
                dp[i] = Math.min(dp[i / 3], min) + 1;
            } else if (i % 3 == 0) {
                dp[i] = Math.min(dp[i / 3], dp[i - 1]) + 1;
            } else if (i % 2 == 0) {
                dp[i] = min + 1;
            } else {
                dp[i] = dp[i - 1] + 1;
            }
        }

        System.out.println(dp[N]);
    }
}