import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int div5 = N / 5;
        int div25 = N / 25;
        int div125 = N / 125;

        System.out.println(div5 + div25 + div125);
    }
}