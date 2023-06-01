import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] origin = new int[N];
        int[] sorted = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(st.nextToken());
            origin[i] = n;
            sorted[i] = n;
        }

        Arrays.sort(sorted);

        HashMap<Integer,Queue<Integer>> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            if (!map.containsKey(sorted[i])) {
                Queue<Integer> q = new LinkedList<>();
                map.put(sorted[i], q);
                q.add(i);
            } else {
                map.get(sorted[i]).add(i);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int n = map.get(origin[i]).poll();
            sb.append(n).append(' ');
        }

        System.out.println(sb);
    }
}