import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> list = new ArrayList<>();
        int idx = 0;
        
        while(idx < score.length){
            list.add(score[idx]);
            list.sort(Comparator.naturalOrder());
            if (list.size() > k)
                list.remove(0);
            answer[idx] = list.get(0);
            idx++;
        }

        return answer;
    }
}