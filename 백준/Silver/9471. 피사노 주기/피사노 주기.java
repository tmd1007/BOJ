import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int k = 0;
            List<Integer> dp = new ArrayList<>();
            dp.add(0);
            dp.add(1);

            int idx = 2;
            while(true) {
                dp.add((dp.get(idx-1) + dp.get(idx-2)) % m);
                if (dp.get(idx) == 0 && dp.get(idx-1) == 1){
                    k = idx;
                    break;
                }
                idx++;
            }

            sb.append(n).append(" ").append(k).append('\n');
        }

        System.out.println(sb);
    }
}