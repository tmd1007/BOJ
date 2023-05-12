import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> set = new LinkedHashSet<>();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            set.add(str);
        }

        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            if (set.contains(str)) {
                list.add(str);
            }
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        sb.append(list.size()).append('\n');
        for (String s: list) {
            sb.append(s).append('\n');
        }

        System.out.println(sb);
    }
}