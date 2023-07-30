import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main (String[] args ) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = 0, y = 0;
        int max = 0;
        for (int i = 1; i <= 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= 9; j++) {
                int n = Integer.parseInt(st.nextToken());
                if (n >= max) {
                    x = i;
                    y = j;
                    max = n;
                }
            }
        }

        System.out.printf("%d\n%d %d", max, x, y);
    }
}