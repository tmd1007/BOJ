import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args ) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        char[] charArr = br.readLine().toCharArray();
        for (int i = 0; i < N - 1; i++) {
            char[] c = br.readLine().toCharArray();
            for (int j = 0; j < c.length; j++) {
                if (charArr[j] != c[j]) {
                    charArr[j] = '?';
                }
            }
        }

        System.out.println(String.valueOf(charArr));

    }
}