import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long N = Long.parseLong(br.readLine());
        int F = Integer.parseInt(br.readLine());

        N = N / 10;
        N = N / 10;
        N = N * 10;
        N = N * 10;

        for (int i = 0; i < 100; i++) {
            long x = N + i;
            String str = String.valueOf(x);
            if (x % F == 0){
                System.out.println(str.substring(str.length()-2));
                break;
            }
        }
    }
}