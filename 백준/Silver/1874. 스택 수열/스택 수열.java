import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] target = new int[N];


        for (int i = 0; i < N; i++) {
            target[i] = Integer.parseInt(br.readLine());
        }

        Stack<Integer> s = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int num = 1;
        int idx = 0;
        while (num <= N) {
            s.add(num);
            sb.append('+').append('\n');
            num++;

            while (!s.empty() && (s.peek() == target[idx])) {
                idx++;
                s.pop();
                sb.append('-').append('\n');
            }
        }

        System.out.println(s.isEmpty() ? sb : "NO");
    }
}