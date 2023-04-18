import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        System.out.println(solution(N));

    }
    
    public static int solution(int n) {
        int cnt = 2;
        int answer = 1;

        for (int i = 9; i < n; i += 3) {
            answer += cnt;
            cnt++;
        }

        return answer;
    }
}