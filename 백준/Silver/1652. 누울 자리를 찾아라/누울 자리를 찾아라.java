import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        char[][] c = new char[N][N];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            c[i] = str.toCharArray();
        }

        int cntR = 0;
        int cntC = 0;
        String[] arr;
        for (int i = 0; i < N; i++) {
            StringBuilder sbR = new StringBuilder();
            StringBuilder sbC = new StringBuilder();
            for (int j = 0; j < N; j++) {
                sbR.append(c[i][j]);
            }
            arr = sbR.toString().split("X");
            for (int j = 0; j <arr.length; j++) {
                if (arr[j].contains(".."))
                    cntR++;
            }

            for (int j = 0; j < N; j++) {
                sbC.append(c[j][i]);
            }
            arr = sbC.toString().split("X");
            for (int j = 0; j <arr.length; j++) {
                if (arr[j].contains(".."))
                    cntC++;
            }
        }

        System.out.println(cntR + " " + cntC);
    }
}