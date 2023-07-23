import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args ) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        while(true) {
            String s = br.readLine();
            if (s.equals("0 0")) {
                break;
            }
            StringTokenizer st = new StringTokenizer(s);
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if ((y % x == 0) && x < y) {
                sb.append("factor").append('\n');
            } else if ((x % y == 0) && x > y) {
                sb.append("multiple").append('\n');
            } else {
                sb.append("neither").append('\n');
            }
        }

        System.out.println(sb);
    }

}