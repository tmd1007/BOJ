import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {

    static int N, M, ans = Integer.MAX_VALUE;
    static boolean[][] map;

    public static int bfs(int n) {
        int cnt = 0;

        for (int i = 1; i <= N; i++) {
            if (n == i) {
                continue;
            }

            Queue<Integer> q = new LinkedList<>();
            q.add(n);

            int[] count = new int[N+1];

            loop :
            while(!q.isEmpty()) {
                int r = q.poll();
                if (r == i) {
                    cnt += count[r];
                    break;
                }

                for (int j = 1; j <= N; j++) {
                    if (map[r][j] && count[j] == 0) {
                        q.add(j);
                        count[j] = count[r] + 1;
                        if (j == i) {
                            cnt += count[j];
                            break loop;
                        }
                    }
                }
            }
        }

        return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new boolean[N+1][N+1];
        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map[a][b] = true;
            map[b][a] = true;
        }

        int result = 0;
        for (int i = 1; i <= N; i++) {
            if (ans > bfs(i)) {
                ans = bfs(i);
                result = i;
            }
        }

        System.out.println(result);
    }
}