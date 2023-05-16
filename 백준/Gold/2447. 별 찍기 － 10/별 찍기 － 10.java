import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    static char[][] map;

    public static void star(int x, int y, int size, boolean b) {
        int div = size / 3;

        if (size == 1) {
            if (b) {
                map[x][y] = ' ';
            } else {
                map[x][y] = '*';
            }
            return;
        }

        if (b) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    star(i * div + x, j * div + y, div, true);
                }
            }
            return;
        }

        int cnt = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cnt++;
                if (cnt == 5) {
                    star(i * div + x, j * div + y, div, true);
                } else {
                    star(i * div + x, j * div + y, div, false);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        map = new char[N][N];

        star(0, 0, N, false);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(map[i][j]);
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}