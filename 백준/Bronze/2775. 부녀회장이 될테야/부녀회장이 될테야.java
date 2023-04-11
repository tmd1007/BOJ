import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    static int[][] apt = new int[15][15];
    static int[] answer;

    public static void main(String[] args) throws IOException {
        Apt();
        Get();
    }

    public static void Apt() {
        for (int i = 1; i < 15; i++) {
            apt[i][1] = 1;
            apt[0][i] = i;
        }

        for (int i = 1; i < 15; i++) {
            for (int j = 2; j < 15; j++) {
                apt[i][j] = apt[i-1][j] + apt[i][j-1];
            }
        }
    }

    public static void Get() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        answer = new int[T];
        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            answer[i] = apt[k][n];
            System.out.println(answer[i]);
        }
    }
}