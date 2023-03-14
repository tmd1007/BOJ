class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zeroCnt = 0;
        int win = 0;
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zeroCnt++;
                continue;
            }
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]){
                    win++;
                    break;
                }
            }
        }

        answer[0] = win == 0 && zeroCnt == 0 ? 6 : 7 - win - zeroCnt;
        answer[1] = 7 - win == 7 ? 6 : 7 - win;

        return answer;
    }
}