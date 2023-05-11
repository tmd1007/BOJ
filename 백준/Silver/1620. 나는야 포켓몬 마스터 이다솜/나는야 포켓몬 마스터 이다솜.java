import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<>();
        String[] str = new String[N];
        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            map.put(name, i + 1);
            str[i] = name;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String k = br.readLine();
            if (map.containsKey(k)) {
                sb.append(map.get(k)).append('\n');
            } else {
                int n = Integer.parseInt(k);
                sb.append(str[n-1]).append('\n');
            }
        }

        System.out.println(sb);
    }
}