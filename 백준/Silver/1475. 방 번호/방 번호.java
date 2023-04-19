import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] c = String.valueOf(br.readLine()).toCharArray();
        int[] arr = new int[10];
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '9')
                c[i] = '6';
            arr[c[i] - '0']++;
        }

        int result = 0;
        arr[6] = arr[6] / 2 + arr[6] % 2;
        for (int i = 0; i < arr.length; i++) {
            if (result < arr[i])
                result = arr[i];
        }

        System.out.println(result);

    }
}