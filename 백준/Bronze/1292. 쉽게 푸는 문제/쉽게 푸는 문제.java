import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    static int start;
    static int end;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());

        int[] numArr = new int[end];
        int n = 1;
        int idx = 0;
        while(numArr[end-1] == 0) {
            for (int i = 1; i <= n; i++) {
                numArr[idx] = n;
                idx++;
                if (numArr[end-1] != 0)
                    break;
            }
            n++;
        }

        int answer = 0;

        for (int i = start; i <= end; i++) {
            answer += numArr[i-1];
        }

        System.out.println(answer);
    }
}