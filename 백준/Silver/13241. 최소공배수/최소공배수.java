import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        System.out.println((a * b) / gcd(a, b));
    }

    public static long gcd(long x, long y) {
        long r = x % y;

        if (r == 0) {
            return y;
        } else {
            return gcd(y, r);
        }
    }

}