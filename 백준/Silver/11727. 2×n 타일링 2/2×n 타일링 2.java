import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        int N = read();

        int[] dp = new int[N + 1];

        if (N < 3) {
            System.out.println(N == 1 ? 1 : 3);
        } else {
            dp[1] = 1;
            dp[2] = 3;

            for (int i = 3; i <= N; i++) {
                dp[i] = (dp[i - 1] + 2 * dp[i - 2]) % 10007;
            }

            System.out.println(dp[N]);
        }
    }

    private static int read() throws IOException {
        int c, n = System.in.read() & 15;

        while((c = System.in.read()) > 32) {
            n = (n << 3) + (n << 1) + (c & 15);
        }

        return n;
    }
}