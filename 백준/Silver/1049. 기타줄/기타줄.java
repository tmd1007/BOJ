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

        int six = 1001, one = 1001;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            six = Math.min(six, n);
            one = Math.min(one, m);
        }

        int sum;

        sum = Math.min(six * ((N / 6) + 1), Math.min(one * N, six * (N / 6) + one * (N % 6)));

        System.out.println(sum);
    }
}