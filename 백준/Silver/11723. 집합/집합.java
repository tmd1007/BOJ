import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        HashSet<Integer> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            switch (s) {
                case "add" -> {
                    int n = Integer.parseInt(st.nextToken());
                    set.add(n);
                }
                case "remove" -> {
                    int n = Integer.parseInt(st.nextToken());
                    set.remove(n);
                }
                case "check" -> {
                    int n = Integer.parseInt(st.nextToken());
                    if (set.contains(n))
                        sb.append(1).append('\n');
                    else sb.append(0).append('\n');
                }
                case "toggle" -> {
                    int n = Integer.parseInt(st.nextToken());
                    if (set.contains(n))
                        set.remove(n);
                    else set.add(n);
                }
                case "all" -> {
                    set.clear();
                    for (int j = 1; j <= 20; j++) {
                        set.add(j);
                    }
                }
                case "empty" -> set.clear();
                default -> {
                }
            }
        }

        System.out.println(sb);
    }
}