import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> queue = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            switch (str) {
                case "push" -> queue.add(Integer.parseInt(st.nextToken()));
                case "pop" -> sb.append(queue.isEmpty() ? -1 : queue.poll()).append('\n');
                case "size" -> sb.append(queue.size()).append('\n');
                case "empty" -> sb.append(queue.isEmpty() ? 1 : 0).append('\n');
                case "front" -> sb.append(queue.isEmpty() ? -1 : queue.peek()).append('\n');
                case "back" -> sb.append(queue.isEmpty() ? -1 : queue.getLast()).append('\n');
            }
        }

        System.out.println(sb);
    }
}

