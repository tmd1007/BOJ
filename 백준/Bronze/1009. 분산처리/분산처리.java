import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while(N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long base = Integer.parseInt(st.nextToken());
            long exponent = Integer.parseInt(st.nextToken());

            long modulus = 10; // 모듈러 값

            long result = 1;
            base %= modulus;

            while (exponent > 0) {
                if (exponent % 2 == 1) {
                    result = (result * base) % modulus;
                }
                base = (base * base) % modulus;
                exponent /= 2;
            }
            if (result == 0) {
                result = 10;
            }
            
            sb.append(result).append('\n');
        }

        System.out.println(sb);
    }
}
