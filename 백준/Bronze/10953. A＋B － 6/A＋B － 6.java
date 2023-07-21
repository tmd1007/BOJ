import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());


        StringBuilder sb = new StringBuilder();
        while(n-- > 0) {
            String[] s = br.readLine().split(",");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);
            sb.append(x+y).append('\n');
        }

        System.out.println(sb);
    }
}