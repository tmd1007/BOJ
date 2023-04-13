import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long[] numArr = new long[n+1];
        numArr[0] = 0;
        numArr[1] = 1;

        for (int i = 2; i < numArr.length; i++) {
            numArr[i] = numArr[i-2] + numArr[i-1];
        }

        System.out.println(numArr[n]);
    }
}