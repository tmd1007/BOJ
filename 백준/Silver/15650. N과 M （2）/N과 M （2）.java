import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    static int N, M;
    static int[] arr;
    static StringBuilder ans = new StringBuilder();

    public static void dfs(int idx, int depth) {
        if (depth == M) {
            for (int i = 0; i < arr.length; i++) {
                ans.append(arr[i]).append(' ');
            }
            ans.append('\n');
            return;
        }

        for (int i = idx; i <= N; i++) {
            arr[depth] = i;
            dfs(i+1, depth + 1);
        }
    }

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];

        dfs(1, 0);
        System.out.println(ans);
    }
}