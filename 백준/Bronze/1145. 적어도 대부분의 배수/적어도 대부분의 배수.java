import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {

    static int N = 5;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numArr = new int[N];
        for (int i = 0; i < N; i++) {
            numArr[i] = Integer.parseInt(st.nextToken());
        }
        int result = Arrays.stream(numArr).min().getAsInt();

        while(true) {
            int chk = 0;
            for (int i = 0; i < numArr.length; i++) {
                if (result % numArr[i] == 0){
                    chk++;
                }
            }

            if (chk >= 3)
                break;

            result++;
        }
        System.out.println(result);
    }
}

