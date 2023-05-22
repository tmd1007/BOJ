import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {

    public static String solv(String n) {
        String[] arr = n.split("");
        Arrays.sort(arr, Collections.reverseOrder());

        if (!arr[arr.length-1].equals("0")) {
            return "-1";
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Integer.parseInt(arr[i]);
        }

        if (sum % 3 != 0) {
            return "-1";
        }

        return String.join("", arr);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(solv(str));
    }
}