import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    static int M = 1234567891;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        char[] charArr = str.toCharArray();
        long total = 0;
        long pow = 1;
        for (int i = 0; i < N; i++) {
            long word = charArr[i] - 'a' + 1;
            total = total + (word * pow % M);
            pow = pow * 31 % M;
        }
        
        total %= M;

        System.out.println(total);

    }
}