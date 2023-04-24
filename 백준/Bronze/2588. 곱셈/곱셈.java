import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] numArr = new int[2];

        for (int i = 0; i < 2; i++) {
            numArr[i] = Integer.parseInt(br.readLine());
        }
        int avg = numArr[0] * numArr[1];
        int[] n = new int[3];

        for (int i = 0; i < n.length; i++) {
            n[i] = numArr[1] % 10;
            numArr[1] /= 10;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            sb.append(numArr[0] * n[i]).append('\n');
        }

        sb.append(avg);

        System.out.println(sb);
    }
}