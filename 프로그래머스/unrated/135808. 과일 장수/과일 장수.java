import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        
        int result = 0;
        int min = k;
        int cnt = 0;

        for (int i = score.length -1; i >= 0; i--) {
            if (min > score[i]){
                min = score[i];
            }
            cnt++;
            if (cnt == m){
                result += min * m;
                cnt = 0;
            }
        }

        return result;
    }
}