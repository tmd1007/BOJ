import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();

        if (str.length() % 3 == 1) {
            sb.append(str.charAt(0) - '0');
        }

        if (str.length() % 3 == 2) {
            sb.append(((str.charAt(0) - '0') * 2) + ((str.charAt(1) - '0')));
        }

        for (int i = str.length()%3; i < str.length(); i = i+3) {
            String s = str.substring(i, 3+i);
            sb.append(((s.charAt(0) - '0') * 4) + ((s.charAt(1) - '0') * 2) + ((s.charAt(2) - '0')));
        }

        System.out.println(sb);
    }
}