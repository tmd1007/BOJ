class Solution {
    public int[] solution(int[] array) {
        int idx = 0;
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if(max < array[i]) {
                max = array[i];
                idx = i;
            }
        }
        
        int[] answer = {max, idx};
        
        return answer;
    }
}