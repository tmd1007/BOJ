class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0){
                    boolean chk = true;
                    for (int k = i-1; k <= i+1; k++) {
                        for (int l = j-1; l <= j+1; l++) {
                            if (k >= 0 && k < m && l >= 0 && l < n && board[k][l] == 1){
                                chk = false;
                                break;
                            }
                        }
                        if (!chk){
                            break;
                        }
                    }
                    if (chk)
                        answer++;
                }
                
            }
        }

        return answer;
    }
}