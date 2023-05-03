import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken() );
        int K = Integer.parseInt(st.nextToken() );
        int max = 0;
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
            if (num > max)
                max = num;
        }

        long start = 1;
        long end = max;
        long result = 0;
        while (start <= end) {
            long mid = (start + end) / 2;
            int cnt = 0;
            for (int i = 0; i < N; i++) {
                cnt += arr[i] / mid;
            }

            if (cnt >= K) {
                start = mid + 1;
                if (result < mid)
                    result = mid;
            } else {
                end = mid - 1;
            }
        }

        System.out.println(result);
    }
}