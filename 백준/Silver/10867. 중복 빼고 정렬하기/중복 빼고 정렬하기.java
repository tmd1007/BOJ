import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    static int[] chk = new int[2001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {  
            chk[Integer.parseInt(st.nextToken()) + 1000]++;
        }

        StringBuilder sb = new StringBuilder();

        
        for (int i = 0; i < 2001; i++) {
            if (chk[i] > 0) {
                sb.append(i - 1000).append(" ");
            }
        }

        System.out.println(sb);
    }
}