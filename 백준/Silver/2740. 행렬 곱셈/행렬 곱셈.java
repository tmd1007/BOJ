import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int x, y;
        int[][] A = new int[0][];
        int[][] B = new int[0][];


        for (int k = 0; k < 2; k++) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            if (k == 0)
                A = new int[x][y];
            else
                B = new int[x][y];

            for (int i = 0; i < x; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < y; j++) {
                    if (k == 0)
                        A[i][j] = Integer.parseInt(st.nextToken());
                    else
                        B[i][j] = Integer.parseInt(st.nextToken());
                }
            }
        }

        int[][] result = new int[A.length][B[0].length];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                for (int k = 0; k < A[0].length; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
                sb.append(result[i][j] + " ");
            }
            sb.append('\n');
        }



        System.out.println(sb);





    }
}