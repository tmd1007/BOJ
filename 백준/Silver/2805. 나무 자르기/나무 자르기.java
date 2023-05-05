import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] arg) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] trees = new int[N];
        st = new StringTokenizer(br.readLine());

        long start = 0;
        long end = 0;

        for (int i = 0; i < trees.length; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
            if (trees[i] > end) {
                end = trees[i];
            }
        }
        long answer = 0;
        while(start <= end) {
            long result = 0;
            long mid = (start + end) / 2;
            for (int i = 0; i < trees.length; i++) {
                int tree = trees[i];
                if (tree > mid)
                    result += tree - mid;
            }

            if (result == M) {
                answer = mid;
                break;
            }
            else if (result > M) {
                start = mid + 1;
                answer = Math.max(answer, mid);
            } else {
                end = mid - 1;
            }
        }

        System.out.println(answer);
    }
}