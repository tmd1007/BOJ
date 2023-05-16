import java.io.IOException;

class Main {

    static boolean[][] map;
    static int[] ans = {0, 0};

    private static int read() throws IOException {
        int c, n = System.in.read() & 15;
        while((c = System.in.read()) > 32) {
            n = (n << 3) + (n << 1) + (c & 15);
        }
        return n;
    }

    public static void solv(int x, int y, int size) {
        boolean first = map[x][y];
        if (chk(x, y, size)) {
            if (first) {
                ans[1]++;
            } else {
                ans[0]++;
            }
            return;
        }

        int div = size / 2;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                solv(i * div + x, j * div + y, div);
            }
        }
    }

    public static boolean chk(int x, int y, int size) {
        boolean first = map[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (first != map[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        int N = read();
        map = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int n = read();
                map[i][j] = n == 1;
            }
        }

        solv(0, 0, N);
        System.out.printf("%d\n%d", ans[0], ans[1]);
    }
}