import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            switch (str) {
                case "push" :
                    stack.push(Integer.parseInt(st.nextToken())); break;
                case "top" :
                    sb.append(!stack.isEmpty() ? stack.peek() : -1).append('\n'); break;
                case "size" :
                    sb.append(stack.size()).append('\n'); break;
                case "empty" :
                    sb.append(stack.isEmpty() ? 1 : 0).append('\n'); break;
                case "pop" :
                    sb.append(!stack.isEmpty() ? stack.pop() : -1).append('\n'); break;
            }
        }

        System.out.println(sb);
    }
}