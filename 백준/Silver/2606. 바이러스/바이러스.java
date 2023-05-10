import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    static int N, M;
    static boolean[][] net;
    static int result;
    static boolean[] visit;

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


        dfs(1);

        System.out.println(result - 1);
    }

    static void dfs(int idx) {
        visit[idx] = true;
        result++;
        for (int i = 1; i <= net.length - 1; i++) {
            if (!visit[i] && net[idx][i]) {
                dfs(i);
            }
        }
    }
}