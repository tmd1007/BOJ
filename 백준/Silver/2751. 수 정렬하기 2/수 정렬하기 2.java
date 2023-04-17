import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean[] chk = new boolean[2000001];

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            chk[Integer.parseInt(br.readLine()) + 1000000] = true;
        }

        for (int i = 0; i < chk.length; i++) {
            if (chk[i]) {
                sb.append(i - 1000000).append('\n');
            }
        }

        System.out.println(sb);
    }
}