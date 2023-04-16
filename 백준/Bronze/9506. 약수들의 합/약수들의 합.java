import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = 0;
        while((n = Integer.parseInt(br.readLine())) != -1) {
            chk(n);
        }

        System.out.println(sb);
    }

    public static void chk(int n) {
        StringBuilder result = new StringBuilder();
        result.append(n).append(" = 1");
        int sum = 1;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0){
                sum += i;
                result.append(" + ").append(i);
            }
        }

        if (sum == n) {
            sb.append(result).append("\n");
        } else {
            sb.append(n).append(" is NOT perfect.\n");
        }
    }
}
