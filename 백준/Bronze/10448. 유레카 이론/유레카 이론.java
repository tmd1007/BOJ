import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] T = new int[51];
        for (int i = 0; i < T.length; i++) {
            T[i] = i * (i + 1) / 2;
        }

        for (int i = 0; i < N; i++) {
            int sum = 0;
            int test = Integer.parseInt(br.readLine());
            boolean chk = false;
            loop:
            for (int j = 1; j < T.length; j++) {
                for (int k = 1; k < T.length; k++) {
                    for (int l = 1; l < T.length; l++) {
                        sum = T[j] + T[k] + T[l];
                        if (sum == test) {
                            chk = true;
                            break loop;
                        }
                        else if (sum > test) {
                            break;
                        }
                    }
                }
            }
            if (chk)
                sb.append(1 + "\n");
            else sb.append(0 + "\n");
        }

        System.out.println(sb);
    }
}