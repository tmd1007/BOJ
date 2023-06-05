import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {

    static int[][] map;
    static int[][] visit;
    static int N,M;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    static StringBuilder sb = new StringBuilder();

    public static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        while(!q.isEmpty()) {
            int qx = q.peek()[0];
            int qy = q.peek()[1];
            q.poll();
            for (int i = 0; i < 4; i++) {
                int newX = qx + dx[i];
                int newY = qy + dy[i];
                if (newX >= 0 && newX < N && newY >= 0 && newY < M) {
                    if (map[newX][newY] == 1 && visit[newX][newY] == 0) {
                        visit[newX][newY] = visit[qx][qy] + 1;
                        q.add(new int[]{newX, newY});
                    }
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 1 && visit[i][j] == 0) {
                    visit[i][j] = -1;
                }
                sb.append(visit[i][j]).append(' ');
            }
            sb.append('\n');
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visit = new int[N][M];
        int[] start = {0, 0};
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 2) {
                    start[0] = i;
                    start[1] = j;
                }
            }
        }

        bfs(start[0], start[1]);
        System.out.println(sb);
    }
}