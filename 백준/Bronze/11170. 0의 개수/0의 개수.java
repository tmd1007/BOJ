import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            cnt = 0;
            for (int j = n; j <= m; j++) {
                String s = String.valueOf(j);
                char[] arr = s.toCharArray();

                for (int k = 0; k < arr.length; k++) {
                    if (arr[k] == '0') {
                        cnt++;
                    }
                }

            }
            sb.append(cnt).append('\n');
        }

        System.out.println(sb);
    }
}