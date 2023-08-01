import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                int n = Integer.parseInt(st.nextToken());
                if (n == 1) {
                    sum++;
                }
            }

            switch (sum) {
                case 1 : sb.append('C').append('\n'); break;
                case 2 : sb.append('B').append('\n'); break;
                case 3 : sb.append('A').append('\n'); break;
                case 4 : sb.append('E').append('\n'); break;
                case 0 : sb.append('D').append('\n'); break;
            }
        }

        System.out.println(sb);
    }
}