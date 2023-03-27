import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int[] nums = new int[Integer.parseInt(st.nextToken())];
            int sum = 0;
            for (int j = 0; j < nums.length; j++) {
                nums[j] = Integer.parseInt(st.nextToken());
                sum += nums[j];
            }
            double avg = (double) sum / nums.length;
            int cnt = 0;
            for (int j = 0; j < nums.length; j++) {
                if ((double)nums[j] > avg)
                    cnt++;
            }
            double per = (double) cnt / nums.length * 100;
            System.out.printf("%.3f%%\n", per);
        }
    }
}


