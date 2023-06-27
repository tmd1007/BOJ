import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int X = Integer.parseInt(br.readLine());
        Arrays.sort(arr);
        int ans = 0;
        int left = 0, right = N-1;
        while(left != right) {
            int sum = arr[left] + arr[right];
            if (sum >= X) {
                if (sum == X) {
                    ans++;
                }
                right--;
            } else {
                left++;
            }
        }

        System.out.println(ans);
    }
}