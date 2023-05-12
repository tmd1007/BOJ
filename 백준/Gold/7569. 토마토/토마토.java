import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {

    static int M, N, H, green;

    static Queue<int[]> q = new LinkedList<>();

    static int[][][] graph, cnt;

    static int[] movZ = {1,-1,0,0,0,0};
    static int[] movX = {0,0,1,-1,0,0};
    static int[] movY = {0,0,0,0,1,-1};

    public static int bfs() {
        int qZ = 0, qX = 0, qY = 0;
        while(!q.isEmpty()) {
            qZ = q.peek()[0];
            qX = q.peek()[1];
            qY = q.peek()[2];
            q.poll();
            for (int i = 0; i < 6; i++) {
                int newZ = qZ + movZ[i];
                int newX = qX + movX[i];
                int newY = qY + movY[i];
                if (newZ >= 0 && newZ < H && newX >= 0 && newX < N && newY >= 0 && newY < M) {
                    if (graph[newZ][newX][newY] == 0) {
                        graph[newZ][newX][newY] = graph[qZ][qX][qY] + 1;
                        q.add(new int[]{newZ, newX, newY});
                        green--;
                    }
                }
            }
        }

        return graph[qZ][qX][qY] - 1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        graph = new int[H][N][M];
        cnt = new int[H][N][M];

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < M; k++) {
                    int n = Integer.parseInt(st.nextToken());
                    graph[i][j][k] = n;
                    if (n == 1) {
                        q.add(new int[]{i, j, k});
                    } else if (n == 0) {
                        green++;
                    }
                }
            }
        }

        int ans = bfs();

        System.out.println(green == 0 ? ans : -1);
    }
}