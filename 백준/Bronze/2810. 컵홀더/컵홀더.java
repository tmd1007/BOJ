import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String str = br.readLine();
        int cnt = 0;
        while (str.contains("LL")) {
           str = str.replace("LL", "l");
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'l')
                cnt++;
        }

        if (cnt <= 1) {
            System.out.println(N);
        } else {
            System.out.println(N - cnt + 1);
        }
    }
}