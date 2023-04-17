import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int sum = 0;
        int N, L, K;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][2];
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][0] = Integer.parseInt(st.nextToken());
        }

        boolean[] chk = new boolean[N];

        loop:
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < N; j++) {
                if (i == 0 && arr[j][i] <= L && !chk[j]) {
                    chk[j] = true;
                    sum += 140;
                    cnt++;
                } else if (i == 1 && arr[j][i] <= L && !chk[j]) {
                    chk[j] = true;
                    sum += 100;
                    cnt++;
                }

                if (cnt == K) {
                    break loop;
                }
            }
        }

        System.out.println(sum);
    }
}