import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {

    static int N, M;
    static boolean[][] net;
    static int result;
    static boolean[] visit;

    static Queue<Integer> q;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        net = new boolean[N+1][N+1];
        visit = new boolean[N+1];

        while (M-- > 0) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            net[x][y] = net[y][x] = true;
        }


        bfs();
        System.out.println(result);
    }

    static void bfs() {
        q = new LinkedList<>();
        q.add(1);
        visit[1] = true;

        while(!q.isEmpty()) {
            int idx = q.poll();
            for (int i = 1; i <= N; i++) {
                if (!visit[i] && net[idx][i]) {
                    q.add(i);
                    visit[i] = true;
                    result++;
                }
            }
        }
    }
}