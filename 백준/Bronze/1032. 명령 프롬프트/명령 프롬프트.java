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

        for (int i = 1; i < N; i++) {
            char[] c2 = sb[i].toString().toCharArray();
            for (int j = 0; j < c2.length; j++) {
                if (c1[j] != c2[j]){
                    c1[j] = '?';
                }
            }
        }
        return new String(c1);
    }
}

