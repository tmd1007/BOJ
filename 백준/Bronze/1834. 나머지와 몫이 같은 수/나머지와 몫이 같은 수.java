import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());

        System.out.println(solution(N));
    }

    public static BigInteger solution(int x) {
        BigInteger sum = BigInteger.valueOf(0);
        if (x == 1)
            return sum;

        for (int i = 1; i < x; i++) {
            long n = ((long) x * i) + i;
            sum = sum.add(BigInteger.valueOf(n));
        }

        return sum;
    }
}