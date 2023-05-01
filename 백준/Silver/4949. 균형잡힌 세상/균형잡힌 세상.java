import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        StringBuilder sb = new StringBuilder();
        while (true) {
            StringBuilder target = new StringBuilder();
            str = br.readLine();
            if (str.equals("."))
                break;

            char[] arr = str.toCharArray();
            for (char c : arr) {
                if (c == '(' || c == ')' || c == '[' || c == ']')
                    target.append(c);
            }

            str = target.toString();
            while (str.contains("()") || str.contains("[]")) {
                str = str.replace("()", "");
                str = str.replace("[]", "");
            }

            if (str.length() > 0) {
                sb.append("no").append('\n');
            } else sb.append("yes").append('\n');
        }

        System.out.println(sb);
    }
}