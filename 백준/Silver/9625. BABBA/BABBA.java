import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] a = new int[N+1];
        int[] b = new int[N+1];

        a[1] = 0;
        b[1] = 1;

        for (int i = 2; i <= N; i++) {
            a[i] = b[i-1];
            b[i] = a[i-1] + b[i-1];
        }

        System.out.println(a[N] + " " + b[N]);

    }
}