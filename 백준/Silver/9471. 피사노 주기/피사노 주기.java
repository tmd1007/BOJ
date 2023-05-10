import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Main {
    static int[] dp = new int[500001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        dp[0] = 0;
        dp[1] = 1;

        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int k = 0;

            int idx = 2;
            while(true) {
                dp[idx] = (dp[idx - 1] + dp[idx - 2]) % m;
                if (dp[idx] == 0 && dp[idx-1] == 1) {
                    k = idx;
                    break;
                }
                idx++;
            }

            sb.append(n).append(' ').append(k).append('\n');
        }

        System.out.println(sb);
    }
}