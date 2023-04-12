import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(GCD(a, b));
        System.out.println(LCM(a, b));
    }

    public static int GCD(int x, int y) {
        int r = x % y;
        if (r == 0)
            return y;

        return GCD(y, r);
    }

    public static int LCM(int x, int y) {
        return x * y / GCD(x,y);
    }
}