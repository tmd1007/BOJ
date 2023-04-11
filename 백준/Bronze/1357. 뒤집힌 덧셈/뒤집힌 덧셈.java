import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder x = new StringBuilder(st.nextToken());
        StringBuilder y = new StringBuilder(st.nextToken());

        int a = Integer.parseInt(x.reverse().toString());
        int b = Integer.parseInt(y.reverse().toString());
        StringBuilder ab = new StringBuilder(String.valueOf(a+b));
        System.out.println(Integer.parseInt(ab.reverse().toString()));

    }
}