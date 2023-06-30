import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    static int[] alpha = new int[26];
    static String str;

    public static void solv() {
        if (str.length() == 1) {
            System.out.println(str);
            return;
        }

        int h = 0;
        int idx = -1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < alpha.length; i++) {
            if (alpha[i] % 2 == 1) {
                h++;
                idx = i;
                if (h == 2) {
                    System.out.println("I'm Sorry Hansoo");
                    return;
                }


            }
            for (int j = 0; j < alpha[i] / 2; j++) {
                sb.append((char) (i + 'A'));
            }
        }

        StringBuilder s = new StringBuilder(sb);
        if (idx != -1) {
            s.append((char) (idx + 'A'));

        }

        s.append(sb.reverse());
        System.out.println(s);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        str = br.readLine();
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            int idx = arr[i] - 'A';
            alpha[idx]++;
        }

        solv();
    }
}