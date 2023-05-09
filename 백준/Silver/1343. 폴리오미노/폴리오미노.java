import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        while (str.contains("XXXX")) {
            str = str.replace("XXXX", "AAAA");
        }

        while (str.contains("XX")) {
            str = str.replace("XX", "BB");
        }

        System.out.println(str.contains("X") ? -1 : str);
    }
}