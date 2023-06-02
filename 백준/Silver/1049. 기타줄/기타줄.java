import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int six = Integer.MAX_VALUE, one = Integer.MAX_VALUE;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            six = Math.min(six, n);
            one = Math.min(one, m);
        }

        int sum = 0;

        while (N > 0) {
            if (N >= 6) {
                if (six / 6 < one) {
                    sum += six;
                    N -= 6;
                } else {
                    sum += one;
                    N--;
                }
            } else {
                if (six < one * N) {
                    sum += six;
                    N -= 6;
                } else {
                    sum += one;
                    N--;
                }
            }
        }

        System.out.println(sum);
    }
}