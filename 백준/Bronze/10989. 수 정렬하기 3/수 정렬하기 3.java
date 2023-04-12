import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        int[] numArr = new int[10001];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            numArr[Integer.parseInt(br.readLine())]++;
        }

        for (int i = 1; i < 10001; i++) {
            if (numArr[i] > 0) {
                sb.append((i + "\n").repeat(numArr[i]));
            }
        }

        System.out.println(sb);
    }
}