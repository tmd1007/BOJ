import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        TreeMap<String, Integer> map = new TreeMap<>();

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        int cnt = 0;
        String answer = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int n = entry.getValue();
            if (cnt < n) {
                cnt = n;
                answer = entry.getKey();
            }
        }

        System.out.println(answer);
    }
}