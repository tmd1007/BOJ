import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {

    static int N, M;
    static int[] data;
    static int[] arr;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();
    
    public static void dfs(int depth) {
        if (depth == M) {
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visit[data[i]]) {
                visit[data[i]] = !visit[data[i]];
                arr[depth] = data[i];
                dfs(depth + 1);
                visit[data[i]] = !visit[data[i]];
            }
        }
        
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        data = new int[N];
        arr = new int[M];
        visit = new boolean[10001];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(st.nextToken());
            data[i] = n;
        }
        Arrays.sort(data);

        dfs(0);

        System.out.println(sb);
    }
}