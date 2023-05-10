import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
    static StringBuilder sb = new StringBuilder();
    static boolean[][] graph;
    static boolean[] visit;

    static final int range = 1000 + 1;

    static int N, M, V;

    static Queue<Integer> q;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        graph = new boolean[range][range];
        visit = new boolean[range];

        while(M-- > 0) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph[x][y] = true;
            graph[y][x] = true;
        }

        dfs(V);
        sb.append('\n');
        bfs();

        System.out.println(sb);

    }

    static void dfs(int idx) {
        sb.append(idx).append(' ');
        visit[idx] = true;
        for (int i = 1; i <= N; i++) {
            if (!visit[i] && graph[idx][i]) {
                dfs(i);
            }
        }
    }

    static void bfs() {
        q = new LinkedList<>();
        visit = new boolean[range];

        q.add(V);
        visit[V] = true;
        while(!q.isEmpty()) {
            int idx = q.poll();
            sb.append(idx).append(' ');
            for (int i = 1; i <= N; i++) {
                if (!visit[i] && graph[idx][i]) {
                    q.add(i);
                    visit[i] = true;
                }
            }
        }

    }
}