import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        StringBuilder s = new StringBuilder();
        s.append('I');
        for (int i = 0; i < N; i++) {
            s.append('O').append('I');
        }

        int cnt = 0;
        String str = s.toString();
        StringBuilder sb = new StringBuilder(br.readLine());
        for (int i = 0; i < M - N * 2; i++) {
            if(sb.substring(i, N * 2 + 1 + i).equals(str)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}