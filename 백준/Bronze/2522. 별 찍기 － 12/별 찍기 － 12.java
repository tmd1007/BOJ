import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int line = 2*N-1;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < line; i++) {
            int star = Math.abs(N-i-1);
            for (int j = 0; j < star; j++) {
                sb.append(' ');
            }
            for (int j = 0; j < N-star; j++) {
                sb.append('*');
            }
            sb.append('\n');
        }

        System.out.println(sb);
    } 
}