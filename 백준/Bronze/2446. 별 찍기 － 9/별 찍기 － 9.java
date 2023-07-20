import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args ) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int r = n*2-1;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < r; i++) {
            int a = n - Math.abs(i-r/2);
            for (int j = 0; j < a-1; j++) {
                sb.append(' ');
            }
            for (int j = 0; j < (2*n)-(2*a-1); j++) {
                sb.append('*');
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }
}