import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int ans = 1;
        int n = 0;
        while(n*2 < N) {
            n++;
            int r = n;
            int sum = 0;
            while(sum <= N) {
                sum += r;
                r++;
                if (sum == N) {
                    ans++;
                    break;
                }
            }
        }

        System.out.println(N == 1 ? 1 : ans);
    }
}