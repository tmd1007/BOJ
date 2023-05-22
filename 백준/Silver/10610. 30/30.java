import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {

    public static String solv(String n) {
        char[] arr = n.toCharArray();
        Arrays.sort(arr);
        char[] sortedArr = new char[arr.length];

        if (arr[0] != '0') {
            return "-1";
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Character.getNumericValue(arr[i]);
        }

        if (sum % 3 != 0) {
            return "-1";
        }

        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = arr[arr.length - 1 - i];
        }

        return String.valueOf(sortedArr);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(solv(str));
    }
}