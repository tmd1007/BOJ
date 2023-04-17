import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    static int[] cnt = new int[1000001];
    static int[] cnt2 = new int[1000001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int idx = Integer.parseInt(br.readLine());
            if (idx < 0) {
                cnt[-idx]++;
            } else {
                cnt2[idx]++;
            }
        }

        for (int i = 1000000; i > 0; i--) {
            if (cnt[i] > 0) {
                sb.append(-i).append("\n");
            }
        }

        for (int i = 0; i <= 1000000; i++) {
            if (cnt2[i] > 0) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
    }
}