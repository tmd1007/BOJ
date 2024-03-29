import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[21];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= 20; i++) {
            dp[i] = dp[i-2] + dp[i-1];
        }

        System.out.println(dp[n]);
    }
}