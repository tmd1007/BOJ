import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int[] arr = new int[3];

        if (T % 10 != 0) {
            System.out.println(-1);
        } else {
            if (T / 300 > 0) {
                arr[0] += T / 300;
                T -= (T / 300) * 300;
            }
            if (T / 60 > 0) {
                arr[1] += T / 60;
                T -= (T / 60) * 60;
            }
            arr[2] += T / 10;

            System.out.printf("%d %d %d", arr[0], arr[1], arr[2]);
        }
    }
}