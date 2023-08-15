import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int ans = 0;

        for (int i = 0; i < 8; i++) {
            char[] arr = br.readLine().toCharArray();
            boolean b = false;
            if (i % 2 == 0) {
                b = true;
            }
            for (int j = 0; j < 8; j++) {
                char c = arr[j];
                if (b && c == 'F') {
                    ans++;
                }
                b = !b;
            }
        }

        System.out.println(ans);
    }
}