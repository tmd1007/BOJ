import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {

    static int N, X, ans;
    static int[] visit = new int[100001];


    public static void bfs(int n) {
        Queue<Integer> q = new LinkedList<>();
        q.add(n);
        while(!q.isEmpty()) {
            int loc = q.poll();
            if (loc == X) {
                ans = visit[loc];
                break;
            }
            if (loc - 1 >= 0 && visit[loc - 1] == 0) {
                q.add(loc - 1);
                visit[loc - 1] = visit[loc] + 1;
            }
            if (loc + 1 <= 100000 && visit[loc + 1] == 0) {
                q.add(loc + 1);
                visit[loc + 1] = visit[loc] + 1;
            }
            if (loc * 2 <= 100000 && visit[loc * 2] == 0) {
                q.add(loc * 2);
                visit[loc * 2] = visit[loc] + 1;
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());
        bfs(N);

        System.out.println(ans);
    }
}