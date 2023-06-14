import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {

    static List<Integer>[] lists;
    static int[] visit;
    static int[] depth;

    public static void bfs(int n) {
        Queue<Integer> q = new LinkedList<>();
        q.add(n);
        int cnt = 0;
        visit[n] = ++cnt;
        while(!q.isEmpty()) {
            int cur = q.poll();
            for (int i = 0; i < lists[cur].size(); i++) {
                int next = lists[cur].get(i);
                if (visit[next] == 0) {
                    visit[next] = ++cnt;
                    depth[next] = depth[cur] + 1;
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

        lists = new ArrayList[N+1];
        depth = new int[N+1];
        visit = new int[N+1];

        for (int i = 1; i <= N; i++) {
            lists[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            lists[u].add(v);
            lists[v].add(u);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(lists[i]);
        }

        bfs(R);

        long ans = 0;
        for (int i = 1; i <= N; i++) {
            if (visit[i] == 0)
                depth[i] = -1;
            ans += (long) visit[i] * depth[i];
        }

        System.out.println(ans);
    }
}