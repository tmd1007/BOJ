import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String z = "z";
        z = z.repeat(50);

        for (int i = 0; i < str.length() - 2; i++) {
            for (int j = i + 1; j < str.length() - 1; j++) {
                StringBuilder sb = new StringBuilder();
                StringBuilder one = new StringBuilder(str.substring(0, i+1)).reverse();
                StringBuilder two = new StringBuilder(str.substring(i + 1, j+1)).reverse();
                StringBuilder three = new StringBuilder(str.substring(j + 1)).reverse();
                sb.append(one).append(two).append(three);
                if (sb.toString().compareTo(z) < 0) {
                    z = sb.toString();
                }
            }
        }

        System.out.println(z);

    }
}
