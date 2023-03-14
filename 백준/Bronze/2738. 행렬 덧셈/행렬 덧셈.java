import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][][] num = new int[2][N][M];


        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < num[i][j].length; k++) {
                    num[i][j][k] = Integer.parseInt(st.nextToken());
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int y = num[0][i][j] + num[1][i][j];
                bw.write(y + " ");
            }
            bw.write("\n");
        }

        bw.close();
    }
}