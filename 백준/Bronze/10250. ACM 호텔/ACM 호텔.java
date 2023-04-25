import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());

            int floor;
            int room;

            if (R % H == 0) {
                floor = H * 100;
                room = R / H;
            } else {
                floor = (R % H) * 100;
                room = R / H + 1;
            }
            sb.append(floor + room).append('\n');

        }
        System.out.println(sb);
    }
}