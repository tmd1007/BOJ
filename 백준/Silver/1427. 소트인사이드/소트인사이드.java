import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] cnt = new int[10];
        char[] arr = br.readLine().toCharArray();

        for (int i = 0; i < arr.length; i++) {
            cnt[Character.getNumericValue(arr[i])]++;
        }

        for (int i = cnt.length-1; i >= 0; i--) {
            if (cnt[i] > 0) {
                sb.append((i + "").repeat(cnt[i]));
            }
        }

        System.out.println(sb);
    }
}