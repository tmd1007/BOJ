import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

class Main {

    static Deque<int[]> list = new ArrayDeque<>();
    static StringBuilder sb = new StringBuilder();

    public static void solv(int next) {
        if (next > 0) {
            for (int i = 0; i < next; i++) {
                list.addLast(list.pollFirst());
            }
            sb.append(list.getLast()[0]).append(' ');
            next = list.pollLast()[1];
        } else {
            for (int i = 0; i < -next; i++) {
                list.addFirst(list.pollLast());
            }
            sb.append(list.getFirst()[0]).append(' ');
            next = list.pollFirst()[1];
        }

        if (list.isEmpty()) {
            return;
        }

        solv(next);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            list.add(new int[]{i, Integer.parseInt(st.nextToken())});
        }
        sb.append(list.getFirst()[0]).append(' ');
        int next = list.poll()[1];

        solv(next);
        System.out.println(sb);
    }
}