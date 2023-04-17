import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    static int n1 = 1, n2 = 0;
    static int[] arr = new int[41];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        fib(num);
        fibo(num);
        System.out.println(n1 + " " + n2);

    }

    public static int fib(int n) {

        if (n == 1 || n == 2) {
            return 1;
        }
        else {
            n1++;
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static int fibo(int n) {
        arr[1] = 1; arr[2] = 1;
        for (int i = 3; i <= n; i++) {
            n2++;
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n];
    }
}