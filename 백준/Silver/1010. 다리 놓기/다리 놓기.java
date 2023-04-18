import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class Main {
    static int[][] dp = new int[30][30];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[2];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            System.out.println(DP(arr[1], arr[0]));
        }



    }

    public static int facto(int n) {
        if (n <= 1)
            return 1;
        return n * facto(n - 1);
    }

    public static int BC(int n , int k) {
        if (n == k || k == 0)
            return 1;

        return BC(n - 1, k - 1) + BC(n - 1, k);
    }

    static int DP(int n, int k) {
        if (dp[n][k] > 0)
            return dp[n][k];

        if (n == k || k == 0)
            return dp[n][k] = 1;

        return dp[n][k] = DP(n-1, k-1) + DP(n-1, k);
    }
}
