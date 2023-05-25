import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Queue<Integer> q = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (Math.abs(o1) == Math.abs(o2)) {
                    return o1 - o2;
                } else {
                    return Math.abs(o1) - Math.abs(o2);
                }
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());

            if (n != 0) {
                q.add(n);
            } else {
                if (q.isEmpty()) {
                    sb.append(0).append('\n');
                } else {
                    sb.append(q.poll()).append('\n');
                }
            }
        }

        System.out.println(sb);
    }
}