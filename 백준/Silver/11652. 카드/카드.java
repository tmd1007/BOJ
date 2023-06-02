import com.sun.source.tree.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        TreeMap<Long, Integer> map = new TreeMap<>();

        for (int i = 0; i < N; i++) {
            long n = Long.parseLong(br.readLine());
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        int cnt = 0;
        long answer = 0;
        for (Map.Entry<Long, Integer> entry : map.entrySet()) {
            int n = entry.getValue();
            if (cnt < n) {
                cnt = n;
                answer = entry.getKey();
            }
        }

        System.out.println(answer);
    }
}