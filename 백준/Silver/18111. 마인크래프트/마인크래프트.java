import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[][] ground = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                ground[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int h = -1;
        int sec;
        int result = Integer.MAX_VALUE;
        int result_h = 0;
        
        loop:
        while (h++ <= 256) {
            int block = B;
            sec = 0;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    int n = h - ground[i][j];
                    if (n >= 0) {
                        block -= n;
                        sec += n;
                    } else {
                        sec -= n * 2;
                        block -= n;
                    }
                }
            }

            if (block >= 0 && sec <= result) {
                result = sec;
                result_h = Math.max(h, result_h);
            }

        }

        System.out.println(result + " " + result_h);
    }
}