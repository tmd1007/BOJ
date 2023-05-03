import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    static int[] cnt = new int[8001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int N = T;
        int sum = 0;
        int sol3_cnt = 0;
        int sol3 = 0;
        int min = Integer.MAX_VALUE;
        int max = -4001;
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            cnt[n + 4000]++;
            sum += n;
            if (sol3_cnt < cnt[n + 4000]) {
                sol3_cnt = cnt[n + 4000];
                sol3 = n;
            }
            min = Math.min(min, n);
            max = Math.max(max, n);
        }

        int chk = 0;
        int count = 0;
        long sol1 = Math.round((double)sum / N);
        int sol2 = 0;
        int sol4 = Math.abs(max - min);
        for (int i = 0; i < 8001; i++) {
            if (cnt[i] == sol3_cnt) {
                chk++;
                if (chk == 2) {
                    sol3 = i - 4000;
                }
            }

            while (cnt[i]-- > 0) {
                count++;
                if (count == N / 2 + 1)
                    sol2 = i - 4000;
            }


        }

        StringBuilder sb = new StringBuilder();
        sb.append(sol1).append('\n');
        sb.append(sol2).append('\n');
        sb.append(sol3).append('\n');
        sb.append(sol4).append('\n');
        System.out.println(sb);

    }
}