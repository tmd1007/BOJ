import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {

    static int N, M, R;
    static List<ArrayList<Integer>> list = new ArrayList<>();
    static int[] visit;

    public static void bfs() {
        Queue<Integer> q = new LinkedList<>();
        q.offer(R);
        int len = 1;
        visit[R] = len;
        while(!q.isEmpty()) {
            int cur = q.poll();
            for (int i = 0; i < list.get(cur).size(); i++) {
                int next = list.get(cur).get(i);
                if (visit[next] == 0) {
                    visit[next] = ++len;
                    q.offer(next);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        visit = new int[N+1];

        for (int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            list.get(u).add(v);
            list.get(v).add(u);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(list.get(i));
        }

        bfs();

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < visit.length; i++) {
            sb.append(visit[i]).append('\n');
        }

        System.out.println(sb);
    }
}