import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    static int[] ground = new int[257];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int min = 257;
        int max = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                int n = Integer.parseInt(st.nextToken());
                ground[n]++;
                min = Math.min(min, n);
                max = Math.max(max, n);
            }
        }

        int result = Integer.MAX_VALUE;
        int result_h = min;

        min--;
        while (min++ < max) {
            int block = B;
            int time = 0;
            for (int i = 256; i >= 0; i--) {
                if (ground[i] > 0) {
                    int diff = (i - min) * ground[i];
                    if (diff >= 0) {
                        block += diff;
                        time += diff * 2;
                    } else {
                        block += diff;
                        time -= diff;
                    }
                }
            }

            if (block < 0) {
                break;
            } else {
                if (result >= time) {
                    result = time;
                    result_h = min;
                }
            }
        }

        System.out.println(result + " " + result_h);

    }
}