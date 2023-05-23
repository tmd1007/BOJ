import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st;
            TreeMap<Integer, Integer> map = new TreeMap<>();

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                char c = st.nextToken().charAt(0);
                int n = Integer.parseInt(st.nextToken());
                if (c == 'I') {
                    map.merge(n, 1, Integer::sum);
                } else {
                    if (map.isEmpty()) {
                        continue;
                    }
                    n = n == 1 ? map.lastKey() : map.firstKey();
                    if (map.get(n) == 1) {
                        map.remove(n);
                    } else {
                        map.merge(n, -1, Integer::sum);
                    }
                }
            }

            if (map.isEmpty()) {
                sb.append("EMPTY").append('\n');
            } else {
                sb.append(map.lastKey()).append(' ').append(map.firstKey()).append('\n');
            }
        }

        System.out.println(sb);
    }
}