import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {

    static int[][] graph;
    static int[][] cnt;
    static int ans;

    static int M;
    static int N;

    static int[] movX = {-1, 1, 0, 0};
    static int[] movY = {0, 0, 1, -1};

    static int green;

    public static void bfs() {
        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (graph[i][j] == 1) {
                    q.add(new int[]{i, j});
                } else if (graph[i][j] == 0) {
                    green++;
                }
            }
        }

        while(!q.isEmpty()) {
            int qX = q.peek()[0];
            int qY = q.peek()[1];
            q.poll();
            for (int i = 0; i < 4; i++) {
                int newX = qX + movX[i];
                int newY = qY + movY[i];
                if (newX >= 0 && newX < N && newY >= 0 && newY < M) {
                    if (graph[newX][newY] == 0) {
                        graph[newX][newY] = 1;
                        green--;
                        cnt[newX][newY] = cnt[qX][qY] + 1;
                        q.add(new int[]{newX, newY});
                        ans = Math.max(ans, cnt[newX][newY]);
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        graph = new int[N][M];
        cnt = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        bfs();

        System.out.println(green == 0 ? ans : -1);
    }
}