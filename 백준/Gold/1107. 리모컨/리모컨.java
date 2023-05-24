import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    static int ans;
    static boolean[] btn;

    public static boolean chk(String s) {
        for (int i = 0; i < s.length(); i++) {
            int idx = Character.getNumericValue(s.charAt(i));
            if (btn[idx]) {
                return false;
            }
        }
        return true;
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
            String s = String.valueOf(i);
            if (!chk(s)) {
                continue;
            }

            hit += s.length();
            hit += Math.abs(target - i);
            ans = Math.min(ans, hit);
        }

        System.out.println(ans);
    }
}