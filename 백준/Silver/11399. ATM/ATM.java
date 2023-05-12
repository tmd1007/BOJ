import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    
    static int[] cnt = new int[1001];
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(st.nextToken());
            cnt[n]++;
        }

        int idx = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if (cnt[i] > 0) {
                while(cnt[i]-- > 0) {
                    arr[idx] = i;
                    idx++;
                    sum += i * N--;
                }
            }
        }

        System.out.println(sum);

    }
}