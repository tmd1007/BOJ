import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {

    static int A, B;
    static boolean[] visit;
    static StringBuilder sb;

    public static void bfs() {
        Queue<DSLR> q = new LinkedList<>();
        q.add(new DSLR(A, new StringBuilder()));
        visit[A] = true;

        while (!q.isEmpty()) {
            int cur = q.peek().n;
            StringBuilder s = q.peek().concat;
            if (cur == B) {
                sb.append(s).append('\n');
                break;
            }
            q.poll();
            for (int i = 0; i < 4; i++) {
                int num = cur;
                StringBuilder newSB = new StringBuilder();
                newSB.append(s);
                if (i == 0) {
                    num = (num * 2) % 10000;
                    newSB.append('D');
                } else if (i == 1) {
                    num = num == 0 ? 9999 : num - 1;
                    newSB.append('S');
                } else if (i == 2){
                    num = num % 1000 * 10 + num / 1000;
                    newSB.append('L');
                } else {
                    num = num % 10 * 1000 + num / 10;
                    newSB.append('R');
                }
                if (!visit[num]) {
                    visit[num] = true;
                    q.add(new DSLR(num, newSB));
                }
            }
        }
    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            visit = new boolean[10000];
            sb = new StringBuilder();
            bfs();
            answer.append(sb);
        }

        System.out.println(answer);
    }
}

class DSLR {
    int n;
    StringBuilder concat;

    public DSLR(int n, StringBuilder concat) {
        this.n = n;
        this.concat = concat;
    }
}