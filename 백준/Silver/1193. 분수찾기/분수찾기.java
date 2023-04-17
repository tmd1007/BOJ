import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int numer = 1;
        int denom = 1;

        for (int i = 1; i < N; i++) {
            if (numer == 1 && denom % 2 == 1) {
                denom++;
            } else if (numer % 2 == 0  && denom == 1) {
                numer++;
            } else if ((numer + denom) % 2 == 1) {
                numer++;
                denom--;
            } else {
                numer--;
                denom++;
            }
        }

        System.out.println(numer + "/" + denom);
    }
}
