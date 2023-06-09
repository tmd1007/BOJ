import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Main {

    static char[][] map;
    static boolean[][] visit;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int N;
    static int RGB, RG;

    public static void bfs(int x, int y, char c) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        visit[x][y] = true;
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            for (int i = 0; i < 4; i++) {
                int newX = cur[0] + dx[i];
                int newY = cur[1] + dy[i];
                if (newX >= 0 && newX < N && newY >= 0 && newY < N && !visit[newX][newY]) {
                    if (map[newX][newY] == c) {
                        visit[newX][newY] = true;
                        q.add(new int[]{newX, newY});
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new char[N][N];

        for (int i = 0; i < N; i++) {
            char[] arr = br.readLine().toCharArray();
            for (int j = 0; j < N; j++) {
                map[i][j] = arr[j];
            }
        }


        for (int k = 0; k < 2; k++) {
            visit = new boolean[N][N];
            if (k == 1) {
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        if (map[i][j] == 'G') {
                            map[i][j] = 'R';
                        }
                    }
                }
            }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (!visit[i][j]) {
                        bfs(i, j, map[i][j]);
                        if (k == 0) {
                            RGB++;
                        } else {
                            RG++;
                        }
                    }
                }
            }
        }
        System.out.println(RGB + " " + RG);
    }
}