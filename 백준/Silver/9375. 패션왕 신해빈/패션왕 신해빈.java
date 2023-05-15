import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map;

        StringBuilder sb = new StringBuilder();
        while(T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            map = new HashMap<>();

            for (int i = 0; i < N; i++) {
                String[] str = br.readLine().split(" ");
                String s = str[1];
                map.put(s, map.getOrDefault(s, 0) + 1);
            }

            int ans = 1;
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                ans *= entry.getValue() + 1;
            }

            sb.append(ans-1).append('\n');
        }

        System.out.println(sb);
    }
}