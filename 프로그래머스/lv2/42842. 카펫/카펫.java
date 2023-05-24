class Solution {
    public int[] solution(int brown, int yellow) {
        int all = brown + yellow;

        for (int i = 3; i <= all; i++) {
            if (all % i == 0) {
                int row = all / i;
                int col = i;
                int y_cnt = (row - 2) * (col - 2);
                int b_cnt = all - y_cnt;
                if (brown == b_cnt && yellow == y_cnt) {
                    return new int[]{row, col};
                }
            }
        }
        
        return new int[]{0,0};
    }
}