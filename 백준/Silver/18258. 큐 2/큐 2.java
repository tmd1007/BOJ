import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int back = 0;
        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");
            String s = str[0];

            switch (s) {
                case "push" : back = Integer.parseInt(str[1]); q.add(back); break;
                case "pop" : sb.append(q.isEmpty() ? -1 : q.poll()).append('\n'); break;
                case "size" : sb.append(q.size()).append('\n'); break;
                case "empty" : sb.append(q.isEmpty() ? 1 : 0).append('\n'); break;
                case "front" : sb.append(q.isEmpty() ? -1 : q.peek()).append('\n'); break;
                default: sb.append(q.isEmpty() ? -1 : back).append('\n'); break;
            }
        }

        System.out.println(sb);
    }
}