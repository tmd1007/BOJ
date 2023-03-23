import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        int sum = 0;
        while((str = br.readLine()) != null){
            int n = Integer.parseInt(str);
            sum += n;
        }

        System.out.println(sum);
    }
}