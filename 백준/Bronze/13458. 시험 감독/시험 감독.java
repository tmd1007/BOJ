import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        long sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= a) {
                sum++;
            } else {
                sum++;
                arr[i] -= a;
                if (arr[i] < b) {
                    sum++;
                } else {
                    sum += arr[i] / b;
                    if (arr[i] % b > 0) {
                        sum++;
                    }
                }
            }
        }

        System.out.println(sum);
    }
}