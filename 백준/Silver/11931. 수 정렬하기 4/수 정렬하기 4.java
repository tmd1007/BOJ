import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Main {
    static int[] cnt = new int[2000001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < N; i++) {
            cnt[Integer.parseInt(br.readLine()) + 1000000]++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 2000000; i >= 0; i--) {
            if (cnt[i] > 0) {
                sb.append(i - 1000000).append('\n');
            }
        }

        System.out.println(sb);
    }
}