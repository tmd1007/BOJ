import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

class Main {

    private static int read() throws IOException {
        int c, n = System.in.read() & 15;
        while((c = System.in.read()) > 32) {
            n = (n << 3) + (n << 1) + (c & 15);
        }
        return n;
    }

    public static void main(String[] args) throws IOException {
        int N = read();
        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            int start = read();
            int end = read();

            arr[i][0] = start;
            arr[i][1] = end;
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[1];
                }
                return o1[1] - o2[1];
            }
        });

        int cnt = 0;
        int recent = 0;

        for (int i = 0; i < N; i++) {
            if (recent <= arr[i][0]) {
                recent = arr[i][1];
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}