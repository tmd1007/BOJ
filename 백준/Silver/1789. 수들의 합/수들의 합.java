import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long N = Long.parseLong(br.readLine());
        long sum = 0;
        int i = 1;
        while (true) {
            sum += i;

            if (sum > N) {
                System.out.println(i-1);
                break;
            }

            i++;
        }
    }
}