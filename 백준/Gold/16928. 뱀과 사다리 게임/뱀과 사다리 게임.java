import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {

    static int[] move = new int[101];
    static boolean[] visit = new boolean[101];
    static int cnt;

    public static void bfs() {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{1,0});
        visit[1] = true;
        while(!q.isEmpty()) {
            int[] cur = q.poll();
            for (int i = 1; i <= 6; i++) {
                int loc = cur[0] + i;
                if (loc >= 100) {
                    cnt = cur[1] + 1;
                    return;
                } else {
                    if (!visit[loc]) {
                        if (move[loc] != 0) {
                            loc = move[loc];
                        }
                        q.add(new int[]{loc, cur[1] + 1});
                        visit[loc] = true;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N + M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            move[a] = b;
        }

        bfs();
        System.out.println(cnt);
    }
}