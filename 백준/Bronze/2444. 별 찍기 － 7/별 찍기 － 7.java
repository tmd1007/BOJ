import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                sb.append(' ');
            }
            for (int j = 0; j < (i + 1) * 2 - 1; j++) {
                sb.append('*');
            }
            sb.append('\n');
        }

        for (int i = 0; i < n * 2 - 1; i++) {
            sb.append('*');
        }
        sb.append('\n');

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < i + 1; j++) {
                sb.append(' ');
            }
            for (int j = 0; j < (n - 1 - i) * 2 - 1; j++) {
                sb.append('*');
            }
            sb.append('\n');
        }
        
        System.out.println(sb);

    }
}