import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine() + " ";
        StringBuilder sb = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        boolean tag = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '<' || c == '>') {
                ans.append(sb.reverse());
                sb = new StringBuilder();
                tag = !tag;
                ans.append(c);
            } else if (c == ' ') {
                ans.append(sb.reverse());
                ans.append(c);
                sb = new StringBuilder();
            } else {
                if (tag) {
                    ans.append(c);
                } else {
                    sb.append(c);
                }
            }
        }

        System.out.println(ans);
    }
}