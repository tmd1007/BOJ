import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numArr = new int[N];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = Integer.parseInt(st.nextToken());
            if (numArr[i] > max)
                max = numArr[i];
            if (numArr[i] < min)
                min = numArr[i];
        }

        int answer = min * max;
        System.out.println(answer);
    }
}

