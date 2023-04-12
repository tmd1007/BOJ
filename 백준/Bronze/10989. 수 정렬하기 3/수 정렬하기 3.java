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
            while(numArr[i] > 0) {
                sb.append(i).append("\n");
                numArr[i]--;
            }
        }

        System.out.println(sb);
    }
}