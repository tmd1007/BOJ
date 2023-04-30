import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int answer = 0;
        int sum;
        while (answer != N) {
            sum = 0;
            int num = answer;
            sum += num;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum == N) {
                System.out.println(answer);
                break;
            }
            answer++;
        }

        if (answer == N)
            System.out.println(0);
    }
}