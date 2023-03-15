import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));

        int total = 1;
        for (int i = 0; i < 3; i++) {
            total *= Integer.parseInt(br.readLine());
        }

        char[] charArr = Integer.toString(total).toCharArray();

        int[] numArr = new int[10];

        for (char c : charArr) {
            numArr[c - 48]++;
        }

        for (int i : numArr) {
            bw.write(i + "\n");
        }

        bw.close();
    }
}