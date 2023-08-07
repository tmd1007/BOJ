import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int I = Integer.parseInt(st.nextToken());

        int ans = a * I;

        while(true) {
            if (Math.ceil((double) ans / a) == I) {
                ans--;
            } else {
                break;
            }
        }

        System.out.println(ans+1);
    }
}