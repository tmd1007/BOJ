import java.io.IOException;

class Main {

    static int[] answer = new int[]{0, 0, 0};
    static int[][] map;

    private static int read() throws IOException {
        int c, n = System.in.read();
        boolean isMinus = false;
        if (n == 45) {
            isMinus = true;
            n = System.in.read() & 15;
        } else {
            n = n & 15;
        }
        while ((c = System.in.read()) > 32) {
            n = (n << 3) + (n << 1) + (c & 15);
        }
        return isMinus ? 2 : n;
    }

    public static void solv(int x, int y, int size) {
        if (chk(x, y, size)) {
            answer[map[x][y]]++;
        } else {
            int div = size / 3;
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    solv(j * div + x, k * div + y, div);
                }
            }

        }
    }

    public static boolean chk(int x, int y, int size) {
        int n = map[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (n != map[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        int N = read();

        map = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = read();
            }
        }

        solv(0, 0, N);
        System.out.printf("%d\n%d\n%d", answer[2], answer[0], answer[1]);
    }
}