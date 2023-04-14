import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        char[] arr = new char[36];
        char c = 'A';
        for (int i = 0; i < arr.length; i++) {
            if (i >= 10){
                arr[i] = c;
                c++;
            } else {
                arr[i] = (char)('0' + i);
            }
        }

        while(N / B != 0) {
            int r = N % B;
            N /= B;
            sb.insert(0, arr[r]);
        }
        sb.insert(0, arr[N]);
        System.out.println(sb);
    }
}
