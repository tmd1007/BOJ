import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int six = 666;
        int cnt = 1;

        while(N != cnt) {
            six++;
            if (String.valueOf(six).contains("666"))
                cnt++;
        }

        System.out.println(six);
    }
}
