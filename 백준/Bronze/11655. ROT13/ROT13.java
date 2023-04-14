import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(ROT13(str));
    }

    public static String ROT13(String str) {
        char[] c = str.toCharArray();

        for (int i = 0; i < c.length; i++) {
            if ((c[i] >= 'A' && c[i] <= 'Z')) {
                c[i] += 13;
                if (c[i] > 'Z')
                    c[i] -= 26;
            } else if (c[i] >= 'a' && c[i] <= 'z') {
                c[i] += 13;
                if (c[i] > 'z')
                    c[i] -= 26;
            }
        }

        return new String(c);
    }
}
