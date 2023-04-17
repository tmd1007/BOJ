import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int M = Integer.parseInt(br.readLine());
            int tmp = 0;
            String tmpStr = "";
            for (int j = 0; j < M; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String str = st.nextToken();
                int beer = Integer.parseInt(st.nextToken());
                if (tmp < beer) {
                    tmp = beer;
                    tmpStr = str;
                }
            }

            sb.append(tmpStr).append("\n");
        }

        System.out.println(sb);
    }
}