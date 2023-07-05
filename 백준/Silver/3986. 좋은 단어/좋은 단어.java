import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int ans = 0;
        while(N-- > 0) {
            char[] arr = br.readLine().toCharArray();
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < arr.length; i++) {
                if (stack.isEmpty()) {
                    stack.push(arr[i]);
                } else {
                    if (stack.peek() == arr[i]) {
                        stack.pop();
                    } else {
                        stack.push(arr[i]);
                    }
                }
            }

            if (stack.isEmpty()) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}