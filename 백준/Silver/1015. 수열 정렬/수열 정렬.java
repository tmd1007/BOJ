import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] B = new int[N];
        int max = 0, cnt = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(st.nextToken());
            A[i] = n;
            max = Math.max(max, n);
        }

        for (int i = 1; i <= max; i++) {
            for (int j = 0; j < N; j++) {
                if (A[j] == i) {
                    B[j] = cnt++;
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(B[i]).append(' ');
        }

        System.out.println(sb);
    }
}