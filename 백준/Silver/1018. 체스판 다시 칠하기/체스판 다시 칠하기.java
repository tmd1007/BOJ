import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int row = x - 8;
        int col = y - 8;
        boolean[][] chess = new boolean[x][y];

        int result = Integer.MAX_VALUE;

        for (int i = 0; i < x; i++) {
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'W')
                    chess[i][j] = true;
            }
        }

        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= col; j++) {
                result = Math.min(result, chk(i, j, chess));
            }
        }

        System.out.println(result);
    }

    static int chk(int x, int y, boolean[][] arr) {
        int result = Integer.MAX_VALUE;
        int cnt;

        boolean chk;

        for (int i = 0; i < 2; i++) {
            cnt = 0;
            chk = i == 0;
            for (int j = x; j < x + 8; j++) {
                for (int k = y; k < y + 8; k++) {
                    if (chk != arr[j][k]) {
                        cnt++;
                    }
                    chk = !chk;
                }
                chk = !chk;
            }
            result = Math.min(result, cnt);
        }

        return result;
    }
}