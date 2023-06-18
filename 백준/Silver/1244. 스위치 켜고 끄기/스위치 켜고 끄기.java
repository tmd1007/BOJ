import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    static boolean[] sw;
    static int N;

    public static void male(int n) {
        int num = n;
        while (true) {
            if (num >= 1 && num <= N) {
                sw[num] = !sw[num];
                num += n;
            } else {
                return;
            }
        }
    }

    public static void female(int n) {
        int left = n;
        int right = n;
        while (true) {
            if (left-1 >= 1 && right+1 <= N) {
                if (sw[left-1] == sw[right+1]) {
                    left--;
                    right++;
                } else {
                    break;
                }
            } else {
                break;
            }
        }

        for (int i = left; i <= right; i++) {
            sw[i] = !sw[i];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        sw = new boolean[N + 1];
        String[] stats = br.readLine().split(" ");
        for (int i = 0; i < stats.length; i++) {
            if (stats[i].equals("1")) {
                sw[i + 1] = true;
            }
        }

        int stu = Integer.parseInt(br.readLine());
        while (stu-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());

            if (gender == 1) {
                male(num);
            } else {
                female(num);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            sb.append(sw[i] ? 1 : 0).append(' ');
            if (i % 20 == 0) {
                sb.append('\n');
            }
        }

        System.out.println(sb);
    }
}