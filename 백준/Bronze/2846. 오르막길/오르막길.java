import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n1 = 1000, n2 = 0;
        int result = 0;
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        n1 = arr[0];

        for (int i = 1; i < N; i++) {
            if (arr[i] > arr[i-1]) {
                n2 = arr[i];
                result = Math.max(result, n2 - n1);
            } else {
                n1 = arr[i];
            }
        }

        System.out.println(result);
    }
}