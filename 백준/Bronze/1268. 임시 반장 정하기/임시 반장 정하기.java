import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main{
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());

        int[][] stu = new int[N][5];
        int[] cnt = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                stu[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = 0;
        int answer = 1;
        for (int i = 0; i < N; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < N; k++) {
                    if (i != k && stu[i][j] == stu[k][j]){
                        set.add(k);
                    }
                }
            }
            cnt[i] += set.size();

            if (max < cnt[i]){
                max = cnt[i];
                answer = i+1;
            }
        }
        System.out.println(answer);
    }
}