import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    static int N, M;
    static int[] arr;
    static boolean[] visit;
    static StringBuilder ans = new StringBuilder();

    public static void dfs(int depth) {
        if (depth == M) {
            for (int i = 0; i < arr.length; i++) {
                ans.append(arr[i]).append(' ');
            }
            ans.append('\n');
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visit[i]) {
                visit[i] = !visit[i];
                arr[depth] = i + 1;
                dfs(depth + 1);
                visit[i] = !visit[i];
            }
        }
    }

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visit = new boolean[N];
        arr = new int[M];

        dfs(0);
        System.out.println(ans);
    }
}