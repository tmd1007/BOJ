import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] chk = new int[4000001];

        for (int i = 0; i < N; i++) {
            chk[Integer.parseInt(st.nextToken()) + 2000000]++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 4000001; i++) {
            if (chk[i] > 0) {
                sb.append((i - 2000000 + " ").repeat(chk[i]));
            }
        }

        System.out.println(sb);
    }
}