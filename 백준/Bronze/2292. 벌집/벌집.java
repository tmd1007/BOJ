import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        int sum = 2;
        if (N == 1)
            System.out.println(1);
        else{
            while(sum <= N){
                sum += cnt * 6;
                cnt++;
            }
            System.out.println(cnt);
        }

    }
}