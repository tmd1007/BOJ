import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s;

        StringBuilder sb = new StringBuilder();

        while((s = br.readLine()) != null) {
            sb.append(s).append('\n');
        }

        System.out.println(sb);
    }
}