import java.io.IOException;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Main {

    private static int read() throws IOException {
        int c, n = System.in.read() & 15;
        while((c = System.in.read()) > 32) {
            n = (n << 3) + (n << 1) + (c & 15);
        }
        return n;
    }

    public static void main(String[] args) throws IOException {
        Queue<Integer> q = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        int N = read();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int n = read();
            if (n == 0) {
                if (q.isEmpty()) {
                    sb.append(0).append('\n');
                } else {
                    sb.append(q.poll()).append('\n');
                }
            } else {
                q.add(n);
            }
        }

        System.out.println(sb);
    }
}