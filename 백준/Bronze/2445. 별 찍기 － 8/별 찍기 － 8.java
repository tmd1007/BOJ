import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        int len = 2*N;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N-1; i++) {
            for (int j = 0; j < i+1; j++) {
                sb.append('*');
            }
            for (int j = 0; j < (N-i-1)*2; j++) {
                sb.append(' ');
            }
            for (int j = 0; j < i+1; j++) {
                sb.append('*');
            }
            sb.append('\n');
        }
        StringBuilder re = new StringBuilder(sb);
        re.reverse();
        for (int i = 0; i < len; i++) {
            sb.append('*');
        }
        sb.append(re);

        System.out.println(sb);
    }
}