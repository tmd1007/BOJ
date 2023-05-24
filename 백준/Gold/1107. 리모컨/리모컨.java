import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    static int ans;
    static boolean[] btn;

    public static int chk(int n) {
        if (n == 0) {
            if (btn[0]) {
                return -1;
            } else {
                return 1;
            }
        }
        int l = 0;
        while(n != 0) {
            int r = n % 10;
            if (btn[r]) {
                return -1;
            }
            l++;
            n /= 10;
        }
        
        return l;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int target = Integer.parseInt(br.readLine());

        int N;
        btn = new boolean[10];
        if ((N = Integer.parseInt(br.readLine())) != 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                int n = Integer.parseInt(st.nextToken());
                btn[n] = true;
            }
        }

        ans = Math.abs(target - 100);

        int hit;
        for (int i = 0; i < 1000000; i++) {
            hit = 0;
            hit += chk(i);
            if (hit == -1) {
                continue;
            }
            
            hit += Math.abs(target - i);
            ans = Math.min(ans, hit);
        }

        System.out.println(ans);
    }
}