import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        String s = br.readLine();
        
        StringBuilder sb = new StringBuilder();
        sb.append('I');
        for (int i = 0; i < N; i++) {
            sb.append('O').append('I');
        }
        
        String io = sb.toString();

        int cnt = 0;
        for (int i = 0; i < M; i++) {
            if (s.substring(i).startsWith(io)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}