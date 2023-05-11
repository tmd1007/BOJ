import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    static boolean[][] graph;
    static int answer;

    static int[] row  = {1, -1, 0, 0};
    static int[] col  = {0, 0, 1, -1};

    public static void dfs(int x, int y) {
        graph[x][y] = false;

        for (int i = 0; i < 4; i++) {
            if (graph[x + row[i]][y + col[i]]) {
                dfs(x + row[i], y + col[i]);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while(T-- > 0) {
            answer = 0;
            st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int cabbage = Integer.parseInt(st.nextToken());

            graph = new boolean[N+2][M+2];

            for (int i = 0; i < cabbage; i++) {
                st = new StringTokenizer(br.readLine());
                int y = Integer.parseInt(st.nextToken()) + 1;
                int x = Integer.parseInt(st.nextToken()) + 1;
                graph[x][y] = true;
            }

            for (int i = 0; i < N+2; i++) {
                for (int j = 0; j < M+2; j++) {
                    if (graph[i][j]) {
                        answer++;
                        dfs(i, j);
                    }
                }
            }

            sb.append(answer).append('\n');
        }

        System.out.println(sb);
    }
}