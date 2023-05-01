import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Character> stack;
        StringBuilder sb = new StringBuilder();
        while(true) {
            char[] arr = br.readLine().toCharArray();
            stack = new Stack<>();
            if (arr.length == 1 && arr[0] == '.')
                break;

            loop :
            for (char c : arr) {
                switch (c) {
                    case '(':
                        stack.add(c);
                        break;
                    case '[':
                        stack.add(c);
                        break;
                    case ')':
                        if (!stack.isEmpty() && stack.peek() == '(') {
                            stack.pop();
                            break;
                        } else {
                            stack.add(c);
                            break loop;
                        }
                    case ']':
                        if (!stack.isEmpty() && stack.peek() == '[') {
                            stack.pop();
                            break;
                        } else {
                            stack.add(c);
                            break loop;
                        }
                }
            }

            if (stack.isEmpty())
                sb.append("yes").append('\n');
            else sb.append("no").append('\n');
        }

        System.out.println(sb);
    }
}