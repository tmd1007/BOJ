import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] numArr = new int[N];
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());
            numArr[i] = n;
        }

        Arrays.sort(numArr);
        for (int i = 0; i < numArr.length; i++) {
            System.out.println(numArr[i]);
        }
    }
}


