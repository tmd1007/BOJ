import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class  Main{
    static int row;
    static int col;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        row = Integer.parseInt(st.nextToken());
        col = Integer.parseInt(st.nextToken());

        char[][] castle = new char[row][col];

        for (int i = 0; i < row; i++) {
            castle[i] = br.readLine().toCharArray();
        }
        int minR = row;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (castle[i][j] == 'X'){
                    minR--;
                    break;
                }
            }
        }

        int minC = col;
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (castle[j][i] == 'X'){
                    minC--;
                    break;
                }
            }
        }
        System.out.println(Math.max(minC, minR));
    }
}