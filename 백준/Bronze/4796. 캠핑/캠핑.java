import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int n = 1;
        while (!Objects.equals(str = br.readLine(), "0 0 0")) {
            String[] arr = str.split(" ");
            int L = Integer.parseInt(arr[0]);
            int P = Integer.parseInt(arr[1]);
            int V = Integer.parseInt(arr[2]);

            int result = ((V / P) * L) + Math.min(L, V % P);
            System.out.printf("Case %d: %d\n", n, result);
            n++;
        }
    }
}
