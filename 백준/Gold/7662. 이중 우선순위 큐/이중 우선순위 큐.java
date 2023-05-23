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
                String s = st.nextToken();
                int n = Integer.parseInt(st.nextToken());
                if (s.equals("I")) {
                    map.put(n, map.getOrDefault(n, 0) + 1);
                } else {
                    if (map.isEmpty()) {
                        continue;
                    }

                    if (n == 1) {
                        map.put(map.lastKey(), map.get(map.lastKey()) - 1);
                        if (map.get(map.lastKey()) == 0) {
                            map.remove(map.lastKey());
                        }
                    } else {
                        map.put(map.firstKey(), map.get(map.firstKey()) - 1);
                        if (map.get(map.firstKey()) == 0) {
                            map.remove(map.firstKey());
                        }
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