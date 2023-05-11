import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {

    static boolean[][] graph;
    static int[][] visit;
    static int[] movX = {-1, 1, 0, 0};
    static int[] movY = {0, 0, 1, -1};

    static int N;
    static int M;
    
    public static void bfs() {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{1,1});
        visit[1][1] = 1;
        graph[1][1] = false;

        while (!q.isEmpty()) {
            int qX = q.peek()[0];
            int qY = q.peek()[1];
            q.poll();

            for (int i = 0; i < 4; i++) {
                int newX = qX + movX[i];
                int newY = qY + movY[i];
                if (graph[newX][newY]) {
                    visit[newX][newY] = visit[qX][qY] + 1;
                    graph[newX][newY] = false;
                    q.add(new int[]{newX, newY});
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new boolean[N+2][M+2];
        visit = new int[N+2][M+2];
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                if (str.charAt(j) == '1') {
                    graph[i + 1][j + 1] = true;
                }
            }
        }

        bfs();

        System.out.println(visit[N][M]);
    }
}