import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

class Main {

    static int N, K;
    static StringBuilder sb = new StringBuilder();

    private static int read() throws IOException {
        int c, n = System.in.read() & 15;
        while((c = System.in.read()) > 32) {
            n = (n << 3) + (n << 1) + (c & 15);
        }
        return n;
    }

    public static void input() throws IOException {
        N = read();
        K = read();
    }

    public static void main(String[] args) throws IOException {
        input();

        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            list.add(i + 1);
        }

        int idx = 0;
        sb.append('<');
        while(list.size() != 1) {
            idx = (idx + K - 1) % list.size();
            sb.append(list.get(idx)).append(',').append(' ');
            list.remove(idx);
        }

        sb.append(list.get(0)).append('>');
        System.out.println(sb);
    }
}