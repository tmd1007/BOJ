import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        int[] cnt = new int[20000001];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cnt[Integer.parseInt(st.nextToken()) + 10000000]++;
        }

        int idx = 0;
        for (int i = 0; i < 20000001; i++) {
            if (cnt[i] > 0) {
                arr[idx] = i - 10000000;
                idx++;
            }
        }

        int M = Integer.parseInt(br.readLine());
        int[] search = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            search[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            if (Arrays.binarySearch(arr, search[i]) >= 0) {
                sb.append(1 + " ");
            } else
                sb.append(0 + " ");
        }

        System.out.println(sb);
    }
}