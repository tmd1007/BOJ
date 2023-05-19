import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {

    static int N, X, ans;
    static boolean[] visit;


    public static void bfs(int n) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{n, 0});
        while(!q.isEmpty()) {
            int loc = q.peek()[0];
            int depth = q.peek()[1];
            visit[loc] = true;
            q.poll();
            if (loc == X) {
                ans = depth;
                break;
            }
            if (chk(loc - 1)) {
                q.add(new int[]{loc - 1, depth + 1});
            }
            if (chk(loc + 1)) {
                q.add(new int[]{loc + 1, depth + 1});
            }
            if (chk(loc * 2)) {
                q.add(new int[]{loc * 2, depth + 1});
            }
        }

    }

    public static boolean chk(int n) {
        if (n < 0 || n > 100000 || visit[n]) {
            return false;
        }

        return true;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());
        visit = new boolean[100001];
        bfs(N);

        System.out.println(ans);
    }
}