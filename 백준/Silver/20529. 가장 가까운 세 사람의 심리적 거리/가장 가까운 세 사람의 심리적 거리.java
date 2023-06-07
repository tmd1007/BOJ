import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            String[] arr = br.readLine().split(" ");
            int ans = Integer.MAX_VALUE;
            loop :
            for (int i = 0; i < N - 2; i++) {
                for (int j = i+1; j < N - 1; j++) {
                    for (int k = j+1; k < N; k++) {
                        int cnt = solv(arr[i], arr[j], arr[k]);
                        ans = Math.min(ans, cnt);
                        if (ans == 0) break loop;
                    }
                }
            }
            sb.append(ans).append('\n');
        }

        System.out.println(sb);
    }

    public static int solv(String s1, String s2, String s3) {
        int cnt = 0;

        for (int i = 0; i < 4; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                cnt++;
            }
        }
        for (int i = 0; i < 4; i++) {
            if (s1.charAt(i) != s3.charAt(i)) {
                cnt++;
            }
        }for (int i = 0; i < 4; i++) {
            if (s2.charAt(i) != s3.charAt(i)) {
                cnt++;
            }
        }

        return cnt;
    }
}