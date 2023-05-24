import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    static int N;
    static boolean[][] map;
    static StringBuilder sb = new StringBuilder();

    public static void solv(int x, int y, int size) {
        if (chk(x, y, size)) {
            sb.append(map[x][y] ? 1 : 0);
        } else {
            int div = size / 2;
            sb.append('(');
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    solv(i * div + x, j * div + y, div);
                }
            }
            sb.append(')');
        }
    }

    public static boolean chk(int x, int y, int size) {
        boolean chk = map[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (map[i][j] != chk) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        map = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c == '1') {
                    map[i][j] = true;
                }
            }
        }

        solv(0, 0, N);

        System.out.println(sb);
    }
}