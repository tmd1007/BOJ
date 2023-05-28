import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        boolean[] chk = new boolean[N+1];
        int cnt = 0;

        loop:
        for (int i = 2; i <= N; i++) {
            if (!chk[i]) {
                for (int j = i; j <= N; j += i) {
                    if (!chk[j]) {
                        chk[j] = true;
                        cnt++;
                        if (cnt == K) {
                            System.out.println(j);
                            break loop;
                        }
                    }
                }
            }
        }
    }
}