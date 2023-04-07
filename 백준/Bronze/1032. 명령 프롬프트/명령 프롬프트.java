import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        StringBuilder[] sb = new StringBuilder[N];
        for (int i = 0; i < N; i++) {
            sb[i] = new StringBuilder(br.readLine());
        }

        System.out.println(make(sb));
    }

    public static String make(StringBuilder[] sb) {
        if (sb.length == 1)
            return sb[0].toString();

        char[] c1 = sb[0].toString().toCharArray();

        for (int i = 0; i < c1.length; i++) {
            for (int j = 1; j < N; j++) {
                if (c1[i] != sb[j].charAt(i)){
                    c1[i] = '?';
                    break;
                }
            }
        }
        return new String(c1);
    }
}

