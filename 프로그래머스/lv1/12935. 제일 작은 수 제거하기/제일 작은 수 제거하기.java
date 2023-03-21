import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        if (arr.length == 1){
            answer = new int[]{-1};
            return answer;
        }
        
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
        }
        
        List<Integer> list = new ArrayList<>();

        for (int i : arr) {
            if (i != min) 
                list.add(i);
        }

        answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}