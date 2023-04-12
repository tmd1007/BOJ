import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Main {
    static int N;
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        if(N != 1){
            while (N != 1) {
                for (int i = 2; i <= N; i++) {
                    if (N % i == 0){
                        list.add(i);
                        N /= i;
                        break;
                    }
                }
            }
        }

        for (int n : list) {
            System.out.println(n);
        }
    }
}