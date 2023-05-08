import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] basket = new int[N];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken()) - 1;
            int end = Integer.parseInt(st.nextToken()) - 1;
            int num = Integer.parseInt(st.nextToken());
            for (int j = start; j <= end; j++) {
                basket[j] = num;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < basket.length; i++) {
            sb.append(basket[i]).append(" ");
        }

        System.out.println(sb);
    }
}