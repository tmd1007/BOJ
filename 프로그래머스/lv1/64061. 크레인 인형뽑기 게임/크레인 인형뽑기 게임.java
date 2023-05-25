import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int N = board.length;
        List<Stack<Integer>> stacks = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            Stack<Integer> s = new Stack<>();
            for (int j = N - 1; j >= 0; j--) {
                if (board[j][i] != 0) {
                    s.push(board[j][i]);
                }
            }
            stacks.add(s);
        }

        Stack<Integer> s = new Stack<>();
        int ans = 0;
        for (int i = 0; i < moves.length; i++) {
            int n = moves[i];
            int r = 0;
            if (!s.isEmpty()) {
                r = s.peek();
            }
            if (!stacks.get(n - 1).isEmpty()) {
                s.push(stacks.get(n - 1).pop());
                if (r == s.peek()) {
                    ans += 2;
                    s.pop();
                    s.pop();
                }
            }
        }
        return ans;
    }
}