import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {

    static int N, M, cnt;
    static char[][] map;
    static boolean[][] visit;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};

    public static void main(String[] args ) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new char[N][M];
        visit = new boolean[N][M];

        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            char[] arr = br.readLine().toCharArray();
            for (int j = 0; j < M; j++) {
                map[i][j] = arr[j];
                if (arr[j] == 'I') {
                    visit[i][j] = true;
                    q.add(new int[]{i, j});
                }
            }
        }

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            for (int i = 0; i < 4; i++) {
                int newX = cur[0] + dx[i];
                int newY = cur[1] + dy[i];
                if (newX >= 0 && newX < N && newY >= 0 && newY < M) {
                    if (map[newX][newY] != 'X' && !visit[newX][newY]) {
                        visit[newX][newY] = true;
                        q.add(new int[]{newX, newY});
                        if (map[newX][newY] == 'P') {
                            cnt++;
                        }
                    }
                }
            }
        }

        System.out.println(cnt == 0 ? "TT" : cnt);
    }
}