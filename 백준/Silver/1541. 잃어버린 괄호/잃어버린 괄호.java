import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int sum = 0;
        String[] arr = str.split("-");
        String[] parse = arr[0].split("\\+");
        for (int i = 0; i < parse.length; i++) {
            sum += Integer.parseInt(parse[i]);
        }

        if (arr.length == 1) {
            System.out.println(sum);
        } else {
            for (int i = 1; i < arr.length; i++) {
                parse = arr[i].split("\\+");
                int minus = 0;
                for (int j = 0; j < parse.length; j++) {
                    minus += Integer.parseInt(parse[j]);
                }
                sum -= minus;
            }

            System.out.println(sum);
        }
    }
}