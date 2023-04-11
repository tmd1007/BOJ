import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder str = new StringBuilder(br.readLine());

        System.out.println(chk(str));
    }

    public static String chk(StringBuilder str) {
        if (str.length() == 1)
            return "NO";

        int idx = 1;
        while(idx != str.length()) {
            StringBuilder left = new StringBuilder(str.substring(0, idx));
            StringBuilder right = new StringBuilder(str.substring(idx));
            if (mul(left) == mul(right))
                return "YES";
            idx++;
        }
        return "NO";
    }

    public static int mul(StringBuilder s) {
        int result = 1;
        for (int i = 0; i < s.length(); i++) {
            result *= s.charAt(i) - '0';
        }
        return result;
    }
}