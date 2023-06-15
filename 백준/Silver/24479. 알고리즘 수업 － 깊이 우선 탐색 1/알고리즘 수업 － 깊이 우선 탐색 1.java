import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {

    static PriorityQueue<Integer>[] node;
    static int[] visit;
    static int depth;

    public static void dfs(int n) {
        if (visit[n] != 0) {
            return;
        } else {
            visit[n] = ++depth;
        }

        while(!node[n].isEmpty()) {
            int next = node[n].poll();
            if (visit[next] == 0) {
                dfs(next);
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());

        node = new PriorityQueue[N+1];
        visit = new int[N+1];

        for (int i = 1; i <= N; i++) {
            node[i] = new PriorityQueue<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            node[u].add(v);
            node[v].add(u);
        }

        dfs(R);

        for (int i = 1; i <= N; i++) {
            System.out.println(visit[i]);
        }
    }
}