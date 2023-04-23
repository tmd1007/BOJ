import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            queue.add(i + 1);
        }

        StringBuilder sb = new StringBuilder();

        while (queue.size() > 0) {
            sb.append(queue.poll()).append(" ");
            if (queue.size() > 0)
                queue.add(queue.poll());
        }

        System.out.println(sb);
    }
}