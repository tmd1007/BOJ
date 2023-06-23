import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        LinkedList<Integer> dq = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            dq.add(i);
        }

        int[] target = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int n = Integer.parseInt(st.nextToken());
            target[i] = n;
        }

        int cnt = 0;
        for (int i = 0; i < M; i++) {
            int idx = dq.indexOf(target[i]);
            if (idx <= dq.size() / 2) {
                while(true) {
                    if (dq.peek() == target[i]) {
                        dq.pop();
                        break;
                    } else {
                        dq.addLast(dq.pollFirst());
                        cnt++;
                    }
                }
            } else {
                while(true) {
                    if (dq.peek() == target[i]) {
                        dq.pop();
                        break;
                    } else {
                        dq.addFirst(dq.pollLast());
                        cnt++;
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}