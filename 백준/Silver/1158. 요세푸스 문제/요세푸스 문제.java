import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

class Main {

    static StringBuilder sb = new StringBuilder();

    private static int read() throws IOException {
        int c, n = System.in.read() & 15;
        while((c = System.in.read()) > 32) {
            n = (n << 3) + (n << 1) + (c & 15);
        }
        return n;
    }

    public static void main(String[] args) throws IOException {
        int N = read();
        int K = read();

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            q.add(i + 1);
        }

        sb.append('<');
        while(q.size() != 1) {
            for (int i = 0; i < K-1; i++) {
                q.add(q.poll());
            }
            sb.append(q.poll()).append(',').append(' ');
        }

        sb.append(q.poll()).append('>');
        System.out.println(sb);
    }
}