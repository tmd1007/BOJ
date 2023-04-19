import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int cnt = 0;

        while (N > 0) {
            if (N % 2 == 1)
                cnt++;
            N /= 2;
        }

        System.out.println(cnt);
    }
}