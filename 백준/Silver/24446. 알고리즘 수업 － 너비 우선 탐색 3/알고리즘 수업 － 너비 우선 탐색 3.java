import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {

    static Queue<Integer>[] node;
    static boolean[] visit;
    static int[] cnt;

    public static void bfs(int n) {
        Queue<Integer> q = new LinkedList<>();
        q.add(n);
        visit[n] = true;
        while(!q.isEmpty()) {
            int cur = q.poll();
            while(!node[cur].isEmpty()) {
                int next = node[cur].poll();
                if (!visit[next]) {
                    visit[next] = true;
                    cnt[next] = cnt[cur] + 1;
                    q.add(next);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        node = new Queue[N+1];
        cnt = new int[N+1];
        visit = new boolean[N+1];

        for (int i = 1; i <= N; i++) {
            node[i] = new LinkedList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            node[u].add(v);
            node[v].add(u);
        }

        bfs(R);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(visit[i] ? cnt[i] : -1).append('\n');
        }

        System.out.println(sb);
    }
}