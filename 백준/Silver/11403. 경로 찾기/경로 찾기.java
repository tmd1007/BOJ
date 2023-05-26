import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {

    static boolean[][] map;
    static boolean[] visit;
    static int N;

    public static void dfs(int start) {
        for (int i = 0; i < N; i++) {
            if (map[start][i] && !visit[i]) {
                visit[i] = true;
                dfs(i);
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        map = new boolean[N][N];

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int n = Integer.parseInt(st.nextToken());
                if (n == 1) {
                    map[i][j] = true;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            visit = new boolean[N];
            dfs(i);
            for (int j = 0; j < N; j++) {
                if (visit[j]) {
                    sb.append(1).append(' ');
                } else {
                    sb.append(0).append(' ');
                }
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}