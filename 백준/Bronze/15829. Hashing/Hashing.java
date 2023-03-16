import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int total = 0;

        for (int i = 0; i < str.length(); i++) {
            total += Math.pow(31, i) * (str.charAt(i) - 'a' + 1);
        }

        System.out.println(total);
    }
}
