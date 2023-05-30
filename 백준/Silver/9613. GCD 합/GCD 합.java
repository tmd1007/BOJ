import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int[] arr = new int[Integer.parseInt(st.nextToken())];

            for (int i = 0; i < arr.length; i++) {
                int n = Integer.parseInt(st.nextToken());
                arr[i] = n;
            }

            long sum = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    sum += gcd(arr[i], arr[j]);
                }
            }

            sb.append(sum).append('\n');
        }

        System.out.println(sb);
    }
}