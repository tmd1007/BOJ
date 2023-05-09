import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            int n = Integer.parseInt(st.nextToken());
            arr[i] = n;
        }

        loop(arr);

        System.out.println(sb);

    }

    public static int[] loop(int[] arr) {
        for (int i = 0; i < 4; i++) {
            int temp = arr[i];
            if (arr[i] > arr[i + 1]) {
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                for (int j = 0; j < 5; j++) {
                    sb.append(arr[j]).append(" ");
                }
                sb.append('\n');
            }
        }

        for (int i = 0; i < 5; i++) {
            if (arr[i] != i+1) {
                return loop(arr);
            }
        }

        return arr;
    }
}