import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

class Main {

    static int N, M, ans;
    static boolean[][] graph;
    static boolean[] visit;


    private static int read() throws IOException {
        int c, n = System.in.read() & 15;
        while((c = System.in.read()) > 32) {
            n = (n << 3) + (n << 1) + (c & 15);
        }
        return n;
    }

 /*   public static void dfs(int idx) {
        visit[idx] = true;

        for (int i = 1; i <= N; i++) {
            if (!visit[i] && graph[idx][i]) {
                dfs(i);
            }
        }
    }*/

    public static void bfs(int idx) {
        Queue<Integer> q = new LinkedList<>();
        q.add(idx);
        visit[idx] = true;

        while(!q.isEmpty()) {
            int start = q.poll();
            for (int i = 1; i <= N; i++) {
                if (!visit[i] && graph[start][i]) {
                    q.add(i);
                    visit[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        N = read();
        M = read();

        graph = new boolean[N+1][N+1];
        visit = new boolean[N+1];

        for (int i = 0; i < M; i++) {
            int x = read();
            int y = read();
            graph[x][y] = true;
            graph[y][x] = true;
        }

        for (int i = 1; i <= N; i++) {
            if (!visit[i]) {
                ans++;
                bfs(i);
            }
        }

        System.out.println(ans);
    }
}