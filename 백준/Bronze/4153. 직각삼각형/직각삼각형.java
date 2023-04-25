import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;

        StringBuilder sb = new StringBuilder();
        while (true) {
            str = br.readLine();

            if (str.equals("0 0 0"))
                break;

            String[] arr = str.split(" ");

            int[] numArr = new int[arr.length];
            for (int i = 0; i < numArr.length; i++) {
                numArr[i] = Integer.parseInt(arr[i]);
            }

            Arrays.sort(numArr);

            if (Math.pow(numArr[0], 2) + Math.pow(numArr[1], 2) == Math.pow(numArr[2], 2))
                sb.append("right\n");
            else sb.append("wrong\n");
        }

        System.out.println(sb);
    }
}