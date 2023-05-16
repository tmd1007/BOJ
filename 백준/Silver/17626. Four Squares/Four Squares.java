import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[N+1];

        dp[1] = 1;

        for (int i = 2; i <= N; i++) {
            int min = 4;
            int idx = 1;
            for (int j = idx; j <= i; j = (int)Math.pow(++idx, 2)) {
                min = Math.min(min, dp[i-j]);
            }
            dp[i] = min + 1;
        }

        System.out.println(dp[N]);
    }
}