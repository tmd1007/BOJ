import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[][] country = new int[N][5];
        for (int i = 0; i < N; i++) {
            String[] strArr = br.readLine().split(" ");
            for (int j = 0; j < strArr.length; j++) {
                country[i][j] = Integer.parseInt(strArr[j]);
            }
            country[i][4] = 4;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i != j) {
                    if (country[i][1] > country[j][1]) {
                        country[i][4]--;
                    } else if (country[i][1] == country[j][1]) {
                        if (country[i][2] > country[j][2]) {
                            country[i][4]--;
                        } else if (country[i][2] == country[j][2]) {
                            if (country[i][3] > country[j][3]) {
                                country[i][4]--;
                            } else if (country[i][3] == country[j][3]) {
                                country[i][4]--;
                            }
                        }
                    }
                }
            }
        }


        for (int i = 0; i < N; i++) {
            if (country[i][0] == K) {
                System.out.println(country[i][4]);
                break;
            }
        }
    }
}