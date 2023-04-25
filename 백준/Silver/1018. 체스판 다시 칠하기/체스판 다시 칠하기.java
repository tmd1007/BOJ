import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static int count = Integer.MAX_VALUE;
    static boolean[][] chess;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int row = x - 8;
        int col = y - 8;
        chess = new boolean[x][y];

        for (int i = 0; i < x; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'W')
                    chess[i][j] = true;
            }
        }

        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= col; j++) {
                chk(i, j);
            }
        }

        System.out.println(count);
    }

    static void chk(int x, int y) {
        int cnt;

        boolean chk;

        for (int i = 0; i < 2; i++) {
            cnt = 0;
            chk = i == 0;
            for (int j = x; j < x + 8; j++) {
                for (int k = y; k < y + 8; k++) {
                    if (chk != chess[j][k]) {
                        cnt++;
                    }
                    chk = !chk;
                }
                chk = !chk;
            }
            count = Math.min(count, cnt);
        }
    }
}