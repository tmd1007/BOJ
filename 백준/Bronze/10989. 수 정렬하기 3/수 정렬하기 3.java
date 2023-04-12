import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        int[] numArr = new int[10001];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            numArr[Integer.parseInt(br.readLine())]++;
        }
        br.close();

        for (int i = 1; i < 10001; i++) {
            while(numArr[i] > 0) {
                bw.write(i + "\n");
                numArr[i]--;
            }
        }
        bw.flush();
        bw.close();
    }
}