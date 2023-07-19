import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int b = 2000;

        for (int i = 0; i < 3; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n < b) {
                b = n;
            }
        }

        int m = 2000;
        for (int i = 0; i < 2; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n < m) {
                m = n;
            }
        }

        System.out.println(b + m - 50);
    }
}