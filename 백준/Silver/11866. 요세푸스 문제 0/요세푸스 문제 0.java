import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        LinkedList<Integer> list = new LinkedList<Integer>();

        for (int i = 0; i < N; i++) {
            list.add(i + 1);
        }

        int idx = 0;
        StringBuilder sb = new StringBuilder("<");
        while(list.size() > 1) {
            idx = ((K - 1) + idx) % list.size();
            sb.append(list.get(idx)).append(", ");
            list.remove(idx);
        }

        sb.append(list.remove()).append('>');
        System.out.println(sb);
    }
}