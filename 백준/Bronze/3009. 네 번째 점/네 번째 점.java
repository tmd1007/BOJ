import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[] arrX = new int[1001];
        int[] arrY = new int[1001];

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arrX[x]++;
            arrY[y]++;
        }

        int x = 0, y = 0;

        for (int i = 1; i <= 1000; i++) {
            if (arrX[i] == 1) {
                x = i;
            }
            if (arrY[i] == 1) {
                y = i;
            }
        }

        System.out.printf("%d %d", x, y);

    }
}