import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        Set<String> set = new HashSet<>();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        for (int i = 1; i <= 50; i++) {
            List<String> list = new ArrayList<>();

            for (String s : set) {
                if (s.length() == i) {
                    list.add(s);
                }
            }
            
            if (!list.isEmpty()) {
                list.sort(Comparator.naturalOrder());
                for (String s : list) {
                    sb.append(s).append('\n');
                }
            }
        }

        System.out.println(sb);
    }
}
