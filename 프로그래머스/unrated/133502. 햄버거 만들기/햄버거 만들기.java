import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        Stack<Integer> stack = new Stack<>();
        int cnt = 0;

        for (int i = 0; i < ingredient.length; i++) {
            stack.push(ingredient[i]);
            if (stack.size() >= 4 && stack.elementAt(stack.size()-4) == 1 && stack.elementAt(stack.size()-3) == 2
                    && stack.elementAt(stack.size()-2) == 3 && stack.elementAt(stack.size()-1) == 1){
                cnt++;
                stack.pop();
                stack.pop();
                stack.pop();
                stack.pop();
            }
        }
        return cnt;
    }
}