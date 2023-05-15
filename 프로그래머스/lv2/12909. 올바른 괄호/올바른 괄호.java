import java.util.Stack;

class Solution {
    boolean solution(String s) {
        if (s.charAt(0) == ')')
            return false;

        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];

            if (c == '(') {
                stack.add(c);
            } else if (!stack.isEmpty() && c == ')') {
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}