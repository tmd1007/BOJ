import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    static int ans;
    static int[] arr = new int[3];

    public static void solv(int n) {
        if (n == 1000) {
            return;
        }

        if (n <= 99) {
            ans++;
            return;
        }

        int idx = 0;
        while(n != 0) {
            arr[idx] = n % 10;
            n /= 10;
            idx++;
        }

        if (arr[0] - arr[1] == arr[1] - arr[2]) {
            ans++;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            solv(i);
        }

        System.out.println(ans);
    }
}