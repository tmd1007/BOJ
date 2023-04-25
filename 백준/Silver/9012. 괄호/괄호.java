import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            while (str.contains("()")) {
                str = str.replace("()", "");
            }

            result.append(str.length() == 0 ? "YES\n" : "NO\n");
        }

        System.out.println(result);
    }
}