import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int target = Integer.parseInt(st.nextToken());

            Queue<Case> q = new LinkedList<>();
            ArrayList<Integer> list = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                int priority = Integer.parseInt(st.nextToken());
                if (i != target)
                    q.add(new Case(priority, false));
                else q.add(new Case(priority, true));
                list.add(priority);
            }
            list.sort(Comparator.reverseOrder());
            int cnt = 0;
            while (true) {
                int front = q.peek().priority;
                if (list.get(0) == front) {
                    cnt++;
                    if (q.peek().target) {
                        sb.append(cnt).append('\n');
                        break;
                    } else {
                        q.remove();
                        list.remove(0);
                    }
                } else {
                    q.add(q.poll());
                }
            }
        }

        System.out.println(sb);
    }
}

class Case {
    int priority;
    boolean target;

    public Case(int priority, boolean target) {
        this.priority = priority;
        this.target = target;
    }
}