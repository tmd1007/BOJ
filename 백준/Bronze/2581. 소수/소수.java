import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    static boolean[] prime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        prime = new boolean[N+1];
        prime[0] = prime[1] = true;

        for (int i = 2; i*i <= N; i++) {
            if (!prime[i]) {
                for (int j = i*i; j <= N; j += i) {
                    prime[j] = true;
                }
            }
        }
        int min = 0;
        int sum = 0;
        for (int i = M; i <= N; i++) {
            if (!prime[i]) {
                sum += i;
                if (min == 0) {
                    min = i;
                }
            }
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.printf("%d\n%d", sum, min);
        }
    }
}