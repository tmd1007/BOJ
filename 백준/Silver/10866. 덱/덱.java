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
                case "push_front" -> queue.addFirst(Integer.parseInt(st.nextToken()));
                case "push_back" -> queue.addLast(Integer.parseInt(st.nextToken()));
                case "pop_front" -> sb.append(queue.isEmpty() ? -1 : queue.poll()).append('\n');
                case "pop_back" -> sb.append(queue.isEmpty() ? -1 : queue.pollLast()).append('\n');
                case "size" -> sb.append(queue.size()).append('\n');
                case "empty" -> sb.append(queue.isEmpty() ? 1 : 0).append('\n');
                case "front" -> sb.append(queue.isEmpty() ? -1 : queue.peek()).append('\n');
                case "back" -> sb.append(queue.isEmpty() ? -1 : queue.peekLast()).append('\n');
            }
        }

        System.out.println(sb);
    }
}

