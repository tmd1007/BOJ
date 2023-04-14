
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str = new String[N];
        for (int i = 0; i < N; i++) {
            str[i] = br.readLine();
            System.out.println(reverse(str[i]));
        }

    }

    public static String reverse(String str) {
        String[] arr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            StringBuilder reverse = new StringBuilder(arr[i]).reverse();
            sb.append(reverse).append(" ");
        }
        return sb.deleteCharAt(sb.length()-1).toString();
    }
}