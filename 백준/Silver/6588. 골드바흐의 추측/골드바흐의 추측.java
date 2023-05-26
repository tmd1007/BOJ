import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {

    static boolean[] chk = new boolean[1000001];
    static ArrayList<Integer> list = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N;

        chkPrime();

        while ((N = Integer.parseInt(br.readLine())) != 0) {
            gold(N);
        }

        System.out.println(sb);
    }

    public static void gold(int n) {
        for (int i = 0; i < list.size(); i++) {
            int x = n - list.get(i);
            if (!chk[x]) {
                sb.append(n).append(" = ").append(list.get(i)).append(" + ").append(x).append('\n');
                return;
            }
        }

        sb.append("Goldbach's conjecture is wrong.").append('\n');
    }

    public static void chkPrime() {
        for (int i = 3; i * i < chk.length; i += 2) {
            if (!chk[i]) {
                list.add(i);
                for (int j = i * i; j < chk.length; j += i) {
                    chk[j] = true;
                }
            }
        }
    }
}