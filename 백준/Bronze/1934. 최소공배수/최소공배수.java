import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            System.out.println(LCM(x, y));
        }
    }

    public static int GCD(int x, int y) {
        int r = x % y;
        if (r == 0)
            return y;

        return GCD(y, r);
    }

    public static int LCM(int x, int y) {
        return x * y / GCD(x, y);
    }
}