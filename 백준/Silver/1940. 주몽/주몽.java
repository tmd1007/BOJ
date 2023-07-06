import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        boolean[] isUse = new boolean[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int left = 0, right = N - 1, ans = 0;

        while(left < right) {
            int sum = arr[left] + arr[right];
            if (sum == M) {
                ans++;
                left++;
                right--;
            } else if (sum > M) {
                right--;
            } else {
                left++;
            }
        }

        System.out.println(ans);
    }
}